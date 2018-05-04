//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

package Unit17; 
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Unit15.Ball;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;
	private int points;

//uncomment once you are ready for this part

	private ArrayList<Alien> aliens;
	private ArrayList<Ammo> shots;
	private ArrayList<Ammo> alienShots; 
	private Aliens a; 
	private Alien[][] alienmat; 
	private PowerUp powerup; 
	private ShieldShip shield; 

	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[6];

		//instantiate other stuff
		ship = new Ship(350,430,5);
//		alienOne = new Alien(100,80,3);
//		alienTwo = new Alien(230,80,3);
//		aliens = new ArrayList<Alien>(); 
		shots = new ArrayList<Ammo>();
		alienShots = new ArrayList<Ammo>(); 
		powerup = new PowerUp(690,150,0);
		a = new Aliens(20,20,3);
		alienmat = a.alienMatrix(); 
		points = 9;  
		
//		aliens.add(new Alien(100,80,3));
//		aliens.add(new Alien(230,80,3));

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		ship.draw(graphToBack);
		powerup.draw(graphToBack);
		graphToBack.setColor(Color.WHITE);
		graphToBack.drawString("Points: " + points, 500, 20);
//		alienOne.draw(graphToBack);
//		alienTwo.draw(graphToBack);
//		alienOne.move("LEFT");
//		alienTwo.move("LEFT");
//		
//		for (int i = 0; i < aliens.size(); i++) {
//			aliens.get(i).draw(graphToBack);
//			aliens.get(i).move("LEFT");
//		}
		
		for (int i = 0; i < alienmat.length; i++) {
			for (int j = 0; j < alienmat.length; j++) {
				alienmat[i][j].move("LEFT");
				alienmat[i][j].draw(graphToBack);
			}
		}
		
		
//		ammo.draw(graphToBack);

		if(keys[0] == true)
		{
			ship.move("LEFT");
		}
		if(keys[1] == true)
		{
			ship.move("RIGHT");
		}
		if(keys[2] == true)
		{
			ship.move("UP");

		}
		if(keys[3] == true)
		{
			ship.move("DOWN");
		}
		if(keys[4] == true) {
			Ammo a = new Ammo(ship.getX()+35, ship.getY(), 2);
			shots.add(a);
			keys[4] = false; 
 
		}
//		for (int i = 0; i < alienmat.length; i++) {
//			for (int k = 0; k < alienmat.length; k++) {
//				if(keys[5] == false) {
//					Ammo b = new Ammo(alienmat[i][k].getX()+50, alienmat[i][k].getY()+100, 3);
//					alienShots.add(b);
//					//keys[5] = true; 
//				}
//			}
//		}
		
		for (int i = 0; i < shots.size(); i++) {
				
			shots.get(i).draw(graphToBack);
			shots.get(i).move("UP");

//			if (shots.get(i).getX() > alienOne.getX() && shots.get(i).getX() < alienOne.getX()+200 && shots.get(i).getY() == alienOne.getY()) {
//				alienOne.setPos(1000,1000);
//			}
//			if (shots.get(i).getX() > alienTwo.getX() && shots.get(i).getX() < alienTwo.getX()+200 && shots.get(i).getY() == alienTwo.getY()) {
//				alienTwo.setPos(1000,1000);
//			}
//			for (int j = 0; j < aliens.size(); j++) { 
//				if (shots.get(i).getX() > aliens.get(j).getX() && shots.get(i).getX() < aliens.get(j).getX()+200 && shots.get(i).getY() == aliens.get(j).getY()) {
//					aliens.get(j).setPos(1000,1000);
//				}
//			}
			
			for (int j = 0; j < alienmat.length; j++) {
				for (int k = 0; k < alienmat.length; k++) {
					if (shots.get(i).getX() > alienmat[j][k].getX() && shots.get(i).getX() < alienmat[j][k].getX()+200 && shots.get(i).getY() == alienmat[j][k].getY()) {
						shots.get(i).setPos(1000, 1000);
						alienmat[j][k].setPos(1000,1000);
					}
				}
			}
			
			if (shots.get(i).getX() > powerup.getX() && shots.get(i).getX() < powerup.getX()+224 && shots.get(i).getY() == powerup.getY()) {
				ship.setPos(1000, 1000); 
				ship = new ShieldShip(350,430,5); 
				ship.draw(graphToBack);
				graphToBack.setColor(Color.BLACK);
				graphToBack.drawString("Points: " + points, 500, 20);
				graphToBack.setColor(Color.WHITE);
				graphToBack.drawString("Points: -1294912", 500, 20);
			}
		}
		
		if (ship.getX() == 350) {
			graphToBack.setColor(Color.BLACK);
			graphToBack.drawString("Points: " + points, 500, 20);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Points: -1294912", 500, 20);
		}
		
		for (int i = 0; i < alienShots.size(); i++) {
			alienShots.get(i).draw(graphToBack);
			alienShots.get(i).move("DOWN");
			
			if ((alienShots.get(i).getX()>ship.getX() && alienShots.get(i).getY()<ship.getY())) {
				points--; 
			}	
		}
		
		
		
		//add in collision detection
//		if(!(alienOne.getX()>=0 && alienOne.getX()<=590))
//		{
//			alienOne.setSpeed(-alienOne.getSpeed());
//		}
//		if(!(alienTwo.getX()>=130 && alienTwo.getX()<=720))
//		{
//			alienTwo.setSpeed(-alienTwo.getSpeed());
//		}
		
//		for (int i = 0; i < aliens.size(); i++) {
//			if (!(aliens.get(i).getX()>=0 && aliens.get(i).getX()<=720)) {
//				aliens.get(i).setSpeed(-aliens.get(i).getSpeed());
//			}
//		}
		
		for (int i = 0; i < alienmat.length; i++) {
			for (int j = 0; j < alienmat.length; j++) {
				if (!(alienmat[i][j].getX()>=0 && alienmat[i][j].getX()<=720)) {
					alienmat[i][j].setSpeed(-alienmat[i][j].getSpeed());
				}
			}
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		if (e.getKeyCode() == 'a')
		{
			keys[5] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		if (e.getKeyCode() == 'a')
		{
			keys[5] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{

	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

