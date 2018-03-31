package Unit15;

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable 
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		setWidth(10);
		setHeight(10);
		setColor(Color.BLACK);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	public Ball(int x, int y) {
		super(x, y); 
		setWidth(10);
		setHeight(10);
		setColor(Color.BLACK);
		xSpeed = 3; 
		ySpeed = 1; 
	}
	
	public Ball(int x, int y, int w, int h) {
		super(x, y, w, h); 
		setColor(Color.BLACK);
		xSpeed = 3; 
		ySpeed = 1; 
	}
	
	public Ball(int x, int y, int w, int h, Color c) {
		super(x, y, w, h, c); 
		xSpeed = 3; 
		ySpeed = 1; 
	}

	public Ball(int x, int y, int w, int h, Color c, int xs, int ys) {
		super(x, y, w, h, c); 
		xSpeed = xs; 
		ySpeed = ys; 
	}
	
	//add the set methods
	public void setXSpeed(int xs) {
		xSpeed = xs; 
	}
	
	public void setYSpeed(int ys) {
		ySpeed = ys;
	}
	
	   public int getXSpeed() {
		   return xSpeed; 
	   }
	   
	   public int getYSpeed() {
		   return ySpeed; 
	   }

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   draw(window, Color.WHITE);

	   setX(getX()+xSpeed);
	   setY(getY()+ySpeed);

		//draw the ball at its new location
	   draw(window);
   }
   
	public boolean equals(Object obj)
	{
		Block b = (Block)obj; 
		Ball ball = (Ball)obj;
		if (getX() == b.getX() && getY() == b.getY() && getHeight() == b.getHeight() && getWidth() == b.getWidth() && getColor() == b.getColor() && getXSpeed() == ball.getXSpeed() && getXSpeed() == ball.getXSpeed()) {
			return true; 
		}
		else {
			return false; 
		}
	}   


   //add a toString() method
   public String toString() {
	   String output = "";
	   output += getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor() + " " + xSpeed + " " + ySpeed; 
	   return output; 
   }
   
   public boolean didCollideLeft(Object obj){
		Block bL = (Block)obj;
		if (getX() > bL.getX() && getX() <= bL.getX()+bL.getWidth() && (getY() >= bL.getY() && getY()+getHeight() <= bL.getY()+bL.getHeight())){
			return true;
		}
		else {
			return false; 
		}
	}
	public boolean didCollideRight(Object obj){
		Block bR = (Block)obj;
		if (getX() < bR.getX() && getX()+getWidth() >= bR.getX() && (getY() >= bR.getY() && getY()+getHeight() <= bR.getY()+bR.getHeight())){
			return true;
		}
		else {
			return false; 
		}
	}
	public boolean didCollideTop(Object obj){
		Block bT = (Block)obj;
		if (getY() < bT.getY()+bT.getHeight() && getY()+getHeight() >= bT.getY() && (getX() >= bT.getX() && getX()+getWidth() <= bT.getX()+bT.getWidth())){
			return true;
		}
		else {
			return false; 
		}
	}
	public boolean didCollideBottom(Object obj){
		Block bB = (Block)obj;
		if (getY() <= bB.getY()+bB.getHeight() && getY()+getHeight() > bB.getY() && (getX()>=bB.getX() && getX()+getWidth() <= bB.getX()+bB.getWidth())){
			return true;
		}
		else {
			return false; 
		}
	}
   

}