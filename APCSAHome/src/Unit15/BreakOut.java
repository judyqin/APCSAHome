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
	private Block firstBlock, secondBlock, thirdBlock, fourthBlock, fifthBlock,
	sixthBlock, seventhBlock, eighthBlock, ninthBlock, tenthBlock, 
	eleventhBlock, twelfthBlock, thirteenthBlock, fourteenthBlock, fifteenthBlock,
	sixteenthBlock, seventeenthBlock, eighteenthBlock, ninteenthBlock, twentiethBlock;
	private int score; 
	
	public BreakOut()
	{
		System.out.println("Judy Qin, Period 4, 4/4/18, #23");
		ball = new Ball(600,250,10,10,Color.BLACK,4,5);
		paddle = new Paddle(50,10,10,120,Color.RED,8);
		leftWall = new Wall(0,0,10,600,Color.WHITE);
		rightWall = new Wall(790,0,10,600,Color.WHITE);
		topWall = new Wall(0,0,800,10,Color.WHITE);
		bottomWall = new Wall(0,570,800,10,Color.WHITE);
		firstBlock = new Block(600,10,10,90,Color.BLUE); 
		secondBlock = new Block(650,10,10,90,Color.BLUE);
		thirdBlock = new Block(700,10,10,90,Color.BLUE);
		fourthBlock = new Block(750,10,10,90,Color.BLUE);
		fifthBlock = new Block(600,120,10,90,Color.BLUE);
		sixthBlock = new Block(650,120,10,90,Color.BLUE);
		seventhBlock = new Block(700,120,10,90,Color.BLUE);
		eighthBlock = new Block(750,120,10,90,Color.BLUE);
		ninthBlock = new Block(600,240,10,90,Color.BLUE);
		tenthBlock = new Block(650,240,10,90,Color.BLUE);
		eleventhBlock = new Block(700,240,10,90,Color.BLUE);
		twelfthBlock = new Block(750,240,10,90,Color.BLUE);
		thirteenthBlock = new Block(600,360,10,90,Color.BLUE);
		fourteenthBlock = new Block(650,360,10,90,Color.BLUE);
		fifteenthBlock = new Block(700,360,10,90,Color.BLUE);
		sixteenthBlock = new Block(750,360,10,90,Color.BLUE);
		seventeenthBlock = new Block(600,480,10,90,Color.BLUE);
		eighteenthBlock = new Block(650,480,10,90,Color.BLUE);
		ninteenthBlock = new Block(700,480,10,90,Color.BLUE);
		twentiethBlock = new Block(750,480,10,90,Color.BLUE);
		score = 0; 
		
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
		fourthBlock.draw(graphToBack);
		fifthBlock.draw(graphToBack);
		sixthBlock.draw(graphToBack);
		seventhBlock.draw(graphToBack);
		eighthBlock.draw(graphToBack);
		ninthBlock.draw(graphToBack);
		tenthBlock.draw(graphToBack);
		eleventhBlock.draw(graphToBack);
		twelfthBlock.draw(graphToBack);
		thirteenthBlock.draw(graphToBack);
		fourteenthBlock.draw(graphToBack);
		fifteenthBlock.draw(graphToBack);
		sixteenthBlock.draw(graphToBack);
		seventeenthBlock.draw(graphToBack);
		eighteenthBlock.draw(graphToBack);
		ninteenthBlock.draw(graphToBack);
		twentiethBlock.draw(graphToBack);

		//see if ball hits top wall or bottom wall 
		if(ball.didCollideBottom(topWall) || ball.didCollideTop(bottomWall)) 
		{
			ball.setYSpeed(-ball.getYSpeed());
		}

		//see if the ball hits the right wall 
		
		if(ball.didCollideLeft(rightWall)){
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		//see if ball hits left wall --> reset 
		if(!(ball.getX()>=leftWall.getX())){
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			ball.draw(graphToBack,Color.WHITE);
			ball = new Ball(365,300,10,10,Color.BLACK,3,2);
			ball.moveAndDraw(graphToBack);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + score, 350, 50);
			graphToBack.setColor(Color.PINK);
			score = 0;
			graphToBack.drawString("Score: " + score, 350, 50);
		}
		
		//see if ball hits right of paddle
		if (ball.didCollideRight(paddle))
		{
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(ball.getYSpeed());
		}
		
		//see if ball hits blocks 
		if ((ball.didCollideTop(firstBlock) || ball.didCollideBottom(firstBlock) || ball.didCollideLeft(firstBlock) || ball.didCollideRight(firstBlock)) && firstBlock.getColor() == Color.BLUE)   {
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(ball.getYSpeed());
			firstBlock = new Block(600,10,10,90,Color.WHITE);  
			score += 1; 
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + (score - 1), 350, 50);
			graphToBack.setColor(Color.PINK);
			graphToBack.drawString("Score: " + score, 350, 50);
		}
		
		if ((ball.didCollideTop(secondBlock) || ball.didCollideBottom(secondBlock) || ball.didCollideLeft(secondBlock) || ball.didCollideRight(secondBlock)) && secondBlock.getColor() == Color.BLUE) {
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(ball.getYSpeed());
			secondBlock = new Block(650,10,10,90,Color.WHITE);
			score += 1; 
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + (score - 1), 350, 50);
			graphToBack.setColor(Color.PINK);
			graphToBack.drawString("Score: " + score, 350, 50);
		}
		
		if ((ball.didCollideTop(thirdBlock) || ball.didCollideBottom(thirdBlock) || ball.didCollideLeft(thirdBlock) || ball.didCollideRight(thirdBlock)) && thirdBlock.getColor() == Color.BLUE) {
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(ball.getYSpeed());
			thirdBlock = new Block(700,10,10,90,Color.WHITE);
			score += 1; 
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score " + (score - 1), 350, 50);
			graphToBack.setColor(Color.PINK);
			graphToBack.drawString("Score: " + score, 350, 50);
		}
		
		if ((ball.didCollideTop(fourthBlock) || ball.didCollideBottom(fourthBlock) || ball.didCollideLeft(fourthBlock) || ball.didCollideRight(fourthBlock)) && fourthBlock.getColor() == Color.BLUE) {
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(ball.getYSpeed());
			fourthBlock = new Block(750,10,10,90,Color.WHITE);
			score += 1; 
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + (score - 1), 350, 50);
			graphToBack.setColor(Color.PINK);
			graphToBack.drawString("Score: " + score, 350, 50);
		}
		
		if ((ball.didCollideTop(fifthBlock) || ball.didCollideBottom(fifthBlock) || ball.didCollideLeft(fifthBlock) || ball.didCollideRight(fifthBlock)) && fifthBlock.getColor() == Color.BLUE) {
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(ball.getYSpeed());
			fifthBlock = new Block(600,120,10,90,Color.WHITE);
			score += 1; 
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + (score - 1), 350, 50);
			graphToBack.setColor(Color.PINK);
			graphToBack.drawString("Score: " + score, 350, 50);
		}
		
		if ((ball.didCollideTop(sixthBlock) || ball.didCollideBottom(sixthBlock) || ball.didCollideLeft(sixthBlock) || ball.didCollideRight(sixthBlock)) && sixthBlock.getColor() == Color.BLUE) {
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(ball.getYSpeed());
			sixthBlock = new Block(650,120,10,90,Color.WHITE);
			score += 1; 
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + (score - 1), 350, 50);
			graphToBack.setColor(Color.PINK);
			graphToBack.drawString("Score: " + score, 350, 50);
		}
		
		if ((ball.didCollideTop(seventhBlock) || ball.didCollideBottom(seventhBlock) || ball.didCollideLeft(seventhBlock) || ball.didCollideRight(seventhBlock)) && seventhBlock.getColor() == Color.BLUE) {
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(ball.getYSpeed());
			seventhBlock = new Block(700,120,10,90,Color.WHITE);
			score += 1; 
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + (score - 1), 350, 50);
			graphToBack.setColor(Color.PINK);
			graphToBack.drawString("Score: " + score, 350, 50);
		}
		
		if ((ball.didCollideTop(eighthBlock) || ball.didCollideBottom(eighthBlock) || ball.didCollideLeft(eighthBlock) || ball.didCollideRight(eighthBlock)) && eighthBlock.getColor() == Color.BLUE) {
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(ball.getYSpeed());
			eighthBlock = new Block(750,120,10,90,Color.WHITE);
			score += 1; 
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + (score - 1), 350, 50);
			graphToBack.setColor(Color.PINK);
			graphToBack.drawString("Score: " + score, 350, 50);
		}
		
		if ((ball.didCollideTop(ninthBlock) || ball.didCollideBottom(ninthBlock) || ball.didCollideLeft(ninthBlock) || ball.didCollideRight(ninthBlock)) && ninthBlock.getColor() == Color.BLUE) {
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(ball.getYSpeed());
			ninthBlock = new Block(600,240,10,90,Color.WHITE);
			score += 1; 
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + (score - 1), 350, 50);
			graphToBack.setColor(Color.PINK);
			graphToBack.drawString("Score: " + score, 350, 50);
		}
		
		if ((ball.didCollideTop(tenthBlock) || ball.didCollideBottom(tenthBlock) || ball.didCollideLeft(tenthBlock) || ball.didCollideRight(tenthBlock)) && tenthBlock.getColor() == Color.BLUE) {
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(ball.getYSpeed());
			tenthBlock = new Block(650,240,10,90,Color.WHITE);
			score += 1; 
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + (score - 1), 350, 50);
			graphToBack.setColor(Color.PINK);
			graphToBack.drawString("Score: " + score, 350, 50);
		}
		
		if ((ball.didCollideTop(eleventhBlock) || ball.didCollideBottom(eleventhBlock) || ball.didCollideLeft(eleventhBlock) || ball.didCollideRight(eleventhBlock)) && eleventhBlock.getColor() == Color.BLUE) {
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(ball.getYSpeed());
			eleventhBlock = new Block(700,240,10,90,Color.WHITE);
			score += 1; 
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + (score - 1), 350, 50);
			graphToBack.setColor(Color.PINK);
			graphToBack.drawString("Score: " + score, 350, 50);
		}
		
		if ((ball.didCollideTop(twelfthBlock) || ball.didCollideBottom(twelfthBlock) || ball.didCollideLeft(twelfthBlock) || ball.didCollideRight(twelfthBlock)) && twelfthBlock.getColor() == Color.BLUE) {
			ball.setXSpeed(-ball.getYSpeed());
			ball.setYSpeed(-ball.getYSpeed());
			twelfthBlock = new Block(750,240,10,90,Color.WHITE);
			score += 1; 
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + (score - 1), 350, 50);
			graphToBack.setColor(Color.PINK);
			graphToBack.drawString("Score: " + score, 350, 50);
		}
		
		if ((ball.didCollideTop(thirteenthBlock) || ball.didCollideBottom(thirteenthBlock) || ball.didCollideLeft(thirteenthBlock) || ball.didCollideRight(thirteenthBlock)) && thirteenthBlock.getColor() == Color.BLUE) {
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(ball.getYSpeed());
			thirteenthBlock = new Block(600,360,10,90,Color.WHITE);
			score += 1; 
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + (score - 1), 350, 50);
			graphToBack.setColor(Color.PINK);
			graphToBack.drawString("Score: " + score, 350, 50);
		}
		
		if ((ball.didCollideTop(fourteenthBlock) || ball.didCollideBottom(fourteenthBlock) || ball.didCollideLeft(fourteenthBlock) || ball.didCollideRight(fourteenthBlock)) && fourteenthBlock.getColor() == Color.BLUE) {
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(ball.getYSpeed());
			fourteenthBlock = new Block(650,360,10,90,Color.WHITE);
			score += 1; 
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + (score - 1), 350, 50);
			graphToBack.setColor(Color.PINK);
			graphToBack.drawString("Score: " + score, 350, 50);
		}
		
		if ((ball.didCollideTop(fifteenthBlock) || ball.didCollideBottom(fifteenthBlock) || ball.didCollideLeft(fifteenthBlock) || ball.didCollideRight(fifteenthBlock)) && fifteenthBlock.getColor() == Color.BLUE) {
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(ball.getYSpeed());
			fifteenthBlock = new Block(700,360,10,90,Color.WHITE);
			score += 1; 
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + (score - 1), 350, 50);
			graphToBack.setColor(Color.PINK);
			graphToBack.drawString("Score: " + score, 350, 50);
		}
		
		if ((ball.didCollideTop(sixteenthBlock) || ball.didCollideBottom(sixteenthBlock) || ball.didCollideLeft(sixteenthBlock) || ball.didCollideRight(sixteenthBlock)) && sixteenthBlock.getColor() == Color.BLUE) {
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(ball.getYSpeed());
			sixteenthBlock = new Block(750,360,10,90,Color.WHITE);
			score += 1; 
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + (score - 1), 350, 50);
			graphToBack.setColor(Color.PINK);
			graphToBack.drawString("Score: " + score, 350, 50);
		}
		
		if ((ball.didCollideTop(seventeenthBlock) || ball.didCollideBottom(seventeenthBlock) || ball.didCollideLeft(seventeenthBlock) || ball.didCollideRight(seventeenthBlock)) && seventeenthBlock.getColor() == Color.BLUE) {
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(ball.getYSpeed());
			seventeenthBlock = new Block(600,480,10,90,Color.WHITE);
			score += 1; 
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + (score - 1), 350, 50);
			graphToBack.setColor(Color.PINK);
			graphToBack.drawString("Score: " + score, 350, 50);
		}
		
		if ((ball.didCollideTop(eighteenthBlock) || ball.didCollideBottom(eighteenthBlock) || ball.didCollideLeft(eighteenthBlock) || ball.didCollideRight(eighteenthBlock)) && eighteenthBlock.getColor() == Color.BLUE) {
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(ball.getYSpeed());
			eighteenthBlock = new Block(650,480,10,90,Color.WHITE);
			score += 1; 
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + (score - 1), 350, 50);
			graphToBack.setColor(Color.PINK);
			graphToBack.drawString("Score: " + score, 350, 50);
		}
		
		if ((ball.didCollideTop(ninteenthBlock) || ball.didCollideBottom(ninteenthBlock) || ball.didCollideLeft(ninteenthBlock) || ball.didCollideRight(ninteenthBlock)) && ninteenthBlock.getColor() == Color.BLUE) {
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(ball.getYSpeed());
			ninteenthBlock = new Block(700,480,10,90,Color.WHITE);
			score += 1; 
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + (score - 1), 350, 50);
			graphToBack.setColor(Color.PINK);
			graphToBack.drawString("Score: " + score, 350, 50);
		}
		
		if ((ball.didCollideTop(twentiethBlock) || ball.didCollideBottom(twentiethBlock) || ball.didCollideLeft(twentiethBlock) || ball.didCollideRight(twentiethBlock)) && twentiethBlock.getColor() == Color.BLUE) {
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(ball.getYSpeed());
			twentiethBlock = new Block(750,480,10,90,Color.WHITE);
			score += 1; 
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + (score - 1), 350, 50);
			graphToBack.setColor(Color.PINK);
			graphToBack.drawString("Score: " + score, 350, 50);
		}
		
		//see if the paddles need to be moved
		if(keys[0] == true)
		{
			paddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true)
		{
			paddle.moveDownAndDraw(graphToBack);
		}

		twoDGraph.drawImage(back, null, 0, 0);
	}


   	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
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