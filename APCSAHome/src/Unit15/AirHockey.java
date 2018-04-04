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

public class AirHockey extends Canvas implements KeyListener, Runnable
{
	private SpeedUpBall ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int right; 
	private int left; 
	private Block leftGoal; 
	private Block rightGoal; 
	private Wall leftWall; 
	private Wall rightWall; 
	private Wall topWall; 
	private Wall bottomWall; 
	
	
	Random rand = new Random(); 

	public AirHockey()
	{
		ball = new SpeedUpBall(600,250,10,10,Color.BLACK,3,4);
		leftPaddle = new Paddle(20,10,10,120,Color.RED,8);
		rightPaddle = new Paddle(760,10,10,120,Color.RED,8);	
		leftGoal = new Block(10,210,10,100,Color.BLUE);
		rightGoal = new Block(770,210,10,100,Color.BLUE);
		leftWall = new Wall(0,0,10,600,Color.WHITE);
		rightWall = new Wall(790,0,10,600,Color.WHITE);
		topWall = new Wall(0,0,800,10,Color.WHITE);
		bottomWall = new Wall(0,570,800,10,Color.WHITE);
		right = 0; 
		left = 0; 
		
		keys = new boolean[8];

    
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
		leftGoal.draw(graphToBack);
		rightGoal.draw(graphToBack);
		leftWall.draw(graphToBack);
		rightWall.draw(graphToBack);
		topWall.draw(graphToBack);
		bottomWall.draw(graphToBack);
		graphToBack.setColor(Color.BLACK);
		graphToBack.drawString("SCORES!", 365, 80);
		graphToBack.setColor(Color.PINK);
		graphToBack.drawString("Left Player: " + left, 350, 100);
		graphToBack.drawString("Right Player: " + right, 350, 125);

		//see if ball hits left or right goal
		if(ball.didCollideRight(leftGoal)||ball.didCollideTop(leftGoal)||ball.didCollideBottom(leftGoal)
		||ball.didCollideLeft(rightGoal)||ball.didCollideTop(rightGoal)||ball.didCollideBottom(rightGoal))
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			
			if (ball.getX() >= rightGoal.getX()) {
				left += 1; 
				graphToBack.setColor(Color.WHITE);
				graphToBack.drawString("Left Player: " + (left - 1), 350, 100);
				graphToBack.setColor(Color.PINK);
				graphToBack.drawString("Left Player: " + left, 350, 100);
			}
			
			if (ball.getX() <= leftGoal.getX()) {
				right += 1; 
				graphToBack.setColor(Color.WHITE);
				graphToBack.drawString("Right Player: " + (right - 1), 350, 125);
				graphToBack.setColor(Color.PINK);
				graphToBack.drawString("Right Player: " + right, 350, 125);
			}
			
			ball.draw(graphToBack,Color.WHITE);
			ball = new SpeedUpBall(365,300,10,10,Color.BLACK,3,2);
			ball.moveAndDraw(graphToBack);
			
		}
		
//		if(!((ball.getX()>=leftGoal.getX()&&ball.getY()>=leftGoal.getY())||(ball.getX()>=leftGoal.getX()&&ball.getY()<=leftGoal.getY()+leftGoal.getHeight())||
//		(ball.getX()>=rightGoal.getX()&&ball.getY()>=rightGoal.getY())||(ball.getX()>=rightGoal.getX()&&ball.getY()<=rightGoal.getY()+rightGoal.getHeight())))
		
		//see if ball hits left or right wall
		if(!(ball.getX()>=leftWall.getX() && ball.getX()<=rightWall.getX())) 
		{
			ball.setXSpeed(-ball.getXSpeed());
		}

		//see if the ball hits the top or bottom wall 
		
		if(!(ball.getY()>=topWall.getY() && ball.getY()<=bottomWall.getY())){
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
					ball.setXSpeed(-ball.getXSpeed());
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
			leftPaddle.moveLeftAndDraw(graphToBack);
		}
		if(keys[3] == true)
		{
			leftPaddle.moveRightAndDraw(graphToBack);
		}
		if(keys[4] == true)
		{
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[5] == true)
		{
			rightPaddle.moveDownAndDraw(graphToBack);
		}
		if(keys[6] == true)
		{
			rightPaddle.moveLeftAndDraw(graphToBack);
		}
		if(keys[7] == true)
		{
			rightPaddle.moveRightAndDraw(graphToBack);
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
	}

   

   	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'X' : keys[1]=true; break;
			case 'A' : keys[2]=true; break; 
			case 'D' : keys[3]=true; break; 
			case 'I' : keys[4]=true; break;
			case 'K' : keys[5]=true; break;
			case 'J' : keys[6]=true; break;
			case 'L' : keys[7]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
		case 'W' : keys[0]=false; break;
		case 'X' : keys[1]=false; break;
		case 'A' : keys[2]=false; break; 
		case 'D' : keys[3]=false; break; 
		case 'I' : keys[4]=false; break;
		case 'K' : keys[5]=false; break;
		case 'J' : keys[6]=false; break;
		case 'L' : keys[7]=false; break;
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