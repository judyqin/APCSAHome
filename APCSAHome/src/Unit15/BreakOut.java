package Unit15;

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

public class BreakOut extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle paddle;
	private boolean[] keys;
	private BufferedImage back;
	private Wall leftWall; 
	private Wall rightWall; 
	private Wall topWall; 
	private Wall bottomWall; 
	private Block firstBlock; 
	private Block secondBlock; 
	private Block thirdBlock; 
	
	public BreakOut()
	{
		ball = new Ball(600,250,10,10,Color.BLACK,10,15);
		paddle = new Paddle(300,530,120,10,Color.RED,8);	
		leftWall = new Wall(0,0,10,600,Color.WHITE);
		rightWall = new Wall(790,0,10,600,Color.WHITE);
		topWall = new Wall(0,0,800,10,Color.WHITE);
		bottomWall = new Wall(0,570,800,10,Color.WHITE);
		firstBlock = new Block(130,50,80,10,Color.BLUE); 
		secondBlock = new Block(400,300,80,10,Color.BLUE);
		thirdBlock = new Block(700,200,80,10,Color.BLUE);
		
		keys = new boolean[2];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
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


		ball.moveAndDraw(graphToBack);
		paddle.draw(graphToBack);
		leftWall.draw(graphToBack);
		rightWall.draw(graphToBack);
		topWall.draw(graphToBack);
		bottomWall.draw(graphToBack);
		firstBlock.draw(graphToBack);
		secondBlock.draw(graphToBack);
		thirdBlock.draw(graphToBack);

		//see if ball hits left wall or right wall 
		if(!(ball.getX()>=leftWall.getX() && ball.getX()<=rightWall.getX()))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}

		//see if the ball hits the top wall 
		
		if(!(ball.getY()>=topWall.getY())){
			ball.setYSpeed(-ball.getXSpeed());
		}
		
		if(!(ball.getY()<=bottomWall.getY())){
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			ball.draw(graphToBack,Color.WHITE);
			ball = new Ball(365,300,10,10,Color.BLACK,3,2);
			ball.moveAndDraw(graphToBack);	
		}
		
		//see if ball hits top or bottom of paddle
		if (ball.didCollideTop(paddle))
		{
			ball.setXSpeed(ball.getXSpeed());
			ball.setYSpeed(-ball.getYSpeed());
		}
		
		
		
		//see if the paddles need to be moved
		if(keys[0] == true)
		{
			paddle.moveRightAndDraw(graphToBack);
		}
		if(keys[1] == true)
		{
			paddle.moveLeftAndDraw(graphToBack);
		}

		
		twoDGraph.drawImage(back, null, 0, 0);
	}

   

   	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'I' : keys[0]=true; break;
			case 'W' : keys[1]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'I' : keys[0]=false; break;
			case 'W' : keys[1]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
  public void run()
  {
  	try
  	{
  		while(true)
  		{
  		   Thread.currentThread().sleep(8);
           repaint();
        }
     }catch(Exception e)
     {
     }
 	}	
}