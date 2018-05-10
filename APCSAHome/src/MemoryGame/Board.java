package MemoryGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
//import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;
//import java.util.Scanner;

public class Board extends Canvas implements Runnable, KeyListener {
	
	private static final long serialVersionUID = 1L;
//uncomment once you are ready for this part

	private BalloonsCard balloon, balloon2; 
	private BeachCard beach, beach2; 
	private CupcakeCard cup, cup2; 
	private DogCard dog, dog2; 
	private FlowerCard flower, flower2; 
	private HouseCard house, house2; 
	private IceCreamCard ic, ic2; 
	private PigCard pg, pg2; 
	private PinkCards pinks; 
	private PinkCard[][] pinkmat; 
//	private int r1 = (int)(Math.random() * 4);
//	private int r2 = (int)(Math.random() * 4);
//	private int r3 = (int)(Math.random() * 4);
//	private int r4 = (int)(Math.random() * 4);
	public boolean holding = false; 
	public boolean title = true; 
	public boolean match = false; 
	public boolean not = false; 
	public boolean start = false; 

	private boolean[] keys;
	private BufferedImage back;

	public Board()
	{
		setBackground(Color.WHITE);
		
		keys = new boolean[4];
		
		balloon = new BalloonsCard(200, 150);
		beach = new BeachCard(400, 150);
		cup = new CupcakeCard(600, 150);
		dog = new DogCard(800, 150);
		flower2 = new FlowerCard(200, 300);
		ic = new IceCreamCard(400, 300);
		pg = new PigCard(600, 300);
		flower = new FlowerCard(800, 300);
		cup2 = new CupcakeCard(200, 450); 
		house = new HouseCard(400, 450);
		beach2 = new BeachCard(600, 450);
		pg2 = new PigCard(800, 450);
		dog2 = new DogCard(200, 600);
		balloon2 = new BalloonsCard(400, 600);
		house2 = new HouseCard(600, 600);
		ic2 = new IceCreamCard(800, 600);
		pinks = new PinkCards(200, 150);
		pinkmat = pinks.pMatrix(); 

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
		
		graphToBack.setColor(Color.BLACK);
		graphToBack.drawString("MEMORY GAME ", 25, 50 );
		graphToBack.drawString("If you see a matching pair, type the two numbers as prompted in the console.", 25, 100);
		graphToBack.drawString("Press space to begin!", 25, 150);

		
		if(keys[0] == true && holding == false)
		{
			System.out.println("space");
			title = false; 
		}
		
		if (title == false) {
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("MEMORY GAME ", 25, 50 );
			graphToBack.drawString("If you see a matching pair, type the two numbers as prompted in the console.", 25, 100); 
			graphToBack.drawString("Press space to begin!", 25, 150);
		}
		
		if (keys[0] && holding == false) {
			System.out.println("initialize");
			
			balloon.draw(graphToBack);
			beach.draw(graphToBack);
			cup.draw(graphToBack);
			dog.draw(graphToBack);
			flower.draw(graphToBack);
			house.draw(graphToBack);
			ic.draw(graphToBack);
			pg.draw(graphToBack);
			balloon2.draw(graphToBack);
			beach2.draw(graphToBack);	
			cup2.draw(graphToBack);
			dog2.draw(graphToBack);
			flower2.draw(graphToBack);
			house2.draw(graphToBack);
			ic2.draw(graphToBack);
			pg2.draw(graphToBack);
			
			
			for (int i = 0; i < pinkmat.length; i++) {
				for (int j = 0; j < pinkmat[i].length; j++) {
					pinkmat[i][j].draw(graphToBack);
				}
			}
//			pinkmat = pinks.rand();
			
			holding = true;
		}
		
		if (!keys[0]) {
			holding = false;
		}
		
		if (!keys[3]) {
			holding = false;
		}
		
//		if(keys[1] == true) {
//			match = true; 
//		}
//		
//		if (keys[2] == true) {
//			not = true; 
//		}
		
		if (keys[3] == true) {
			start = true; 
			System.out.println("s key");
		}
		
		if (start == true) {
			pinkmat = pinks.rand();
		}
		
		if (keys[3] && holding == false) {
			System.out.println("s key");
		}
		
//		if (match == true) {
//			System.out.println("hey");
//		}
//		
//		if (!keys[1]) {
//			match = false;
//		}
		
//		if (not == true) {
//			System.out.println("bye");
//			not = false; 
//		}
		
		twoDGraph.drawImage(back, null, 0, 0);
	}
   
   
   public void keyPressed(KeyEvent e)
   {
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[0] = true;
		}
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'Y' : keys[1]=true; break;
			case 'N' : keys[2]=true; break;
			case 'S' : keys[3]=true; break;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[0] = false;
		}
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'Y' : keys[1]=false; break;
			case 'N' : keys[2]=false; break;
			case 'S' : keys[3]=false; break; 
			
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
