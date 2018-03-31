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
import java.util.Random; 

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int right; 
	private int left; 
	Random rand = new Random(); 

	public Pong()
	{
		ball = new Ball(600,250,10,10,Color.BLACK,4,2);
		leftPaddle = new Paddle(10,10,10,120,Color.RED,8);
		rightPaddle = new Paddle(780,10,10,120,Color.RED,8);	
		right = 0; 
		left = 0; 
		
		keys = new boolean[4];

    
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
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		graphToBack.setColor(Color.BLACK);
		graphToBack.drawString("SCORES!", 365, 80);
		graphToBack.setColor(Color.PINK);
		graphToBack.drawString("Left Player: " + left, 350, 100);
		graphToBack.drawString("Right Player: " + right, 350, 125);

		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10 && ball.getX()<=780))
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			
			if (ball.getX() >= 780) {
				left += 1; 
				graphToBack.setColor(Color.WHITE);
				graphToBack.drawString("Left Player: " + (left - 1), 350, 100);
				graphToBack.setColor(Color.PINK);
				graphToBack.drawString("Left Player: " + left, 350, 100);
			}
			
			if (ball.getX() <= 10) {
				right += 1; 
				graphToBack.setColor(Color.WHITE);
				graphToBack.drawString("Right Player: " + (right - 1), 350, 125);
				graphToBack.setColor(Color.PINK);
				graphToBack.drawString("Right Player: " + right, 350, 125);
			}
			
			ball.draw(graphToBack,Color.WHITE);
			ball = new Ball(365, 300);
			ball.moveAndDraw(graphToBack);
			
		}

		//see if the ball hits the top or bottom wall 
		
		if(!(ball.getY()>=20 && ball.getY()<=530)){
			ball.setYSpeed(-ball.getYSpeed());
		}
		
		//see if ball hits top or bottom of paddle
		if (ball.didCollideTop(leftPaddle) || ball.didCollideBottom(leftPaddle) || 
				ball.didCollideTop(rightPaddle) || ball.didCollideBottom(rightPaddle))
		{
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(-ball.getYSpeed());
			
		}
		//see if the ball hits the left paddle
		
		if (ball.didCollideLeft(leftPaddle)) {
				if(ball.getX()<=leftPaddle.getX()+leftPaddle.getWidth()-Math.abs(ball.getXSpeed())){
					ball.setYSpeed(-ball.getYSpeed());
				}
				else {
					ball.setXSpeed(-ball.getXSpeed());
				}
		}
				
		//see if the ball hits the right paddle
				
		if (ball.didCollideRight(rightPaddle)) {
				if(ball.getX()+ball.getWidth()>=rightPaddle.getX()+Math.abs(ball.getXSpeed())){
					ball.setYSpeed(-ball.getYSpeed());
				}
				else {
					ball.setXSpeed(-ball.getYSpeed());
				}
		}

		//see if the paddles need to be moved
		if(keys[0] == true)
		{
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true)
		{
			leftPaddle.moveDownAndDraw(graphToBack);
		}
		if(keys[2] == true)
		{
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[3] == true)
		{
			rightPaddle.moveDownAndDraw(graphToBack);
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
	}

   

   	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
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