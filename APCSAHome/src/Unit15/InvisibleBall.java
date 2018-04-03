package Unit15;

import java.awt.Color;
import java.awt.Graphics; 
import java.util.Random; 

public class InvisibleBall extends Ball {

	private boolean invisible; 
	
	public InvisibleBall()
	   {
		   super();
		   invisible = false; 
	   }

	   public InvisibleBall(int x, int y)
	   {
		   super(x, y);
		   invisible = false; 
	   }


	   public InvisibleBall(int x, int y, int xSpd, int ySpd)
	   {
		   super(x, y);
		   setXSpeed(xSpd);
		   setYSpeed(ySpd);
		   invisible = false; 
	   }

	   public InvisibleBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
	   {
		   super(x, y, wid, ht, xSpd, ySpd);
		   invisible = false; 
	   }


	   public InvisibleBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
	   {
		   super(x, y, wid, ht, col, xSpd, ySpd);
		   invisible = false; 
	   }
	   
	   public boolean isInvisible() {
		   return invisible; 
	   }
	   
	   public void setInvisible(boolean isInvisible) {
		   invisible = isInvisible; 
	   }
	   
	   public double randomnum() {
		   double rnum = Math.random() * 5000; 
		   return rnum; 
	   }
	   
	   public void moveAndDraw(Graphics window) {
		   
		   window.setColor(Color.WHITE);
		   window.fillOval(getX(),getY(),getWidth(),getHeight());
		   
	      setX(getX()+getXSpeed());
			//setY
	      setY(getY()+getYSpeed());
			//draw the ball at its new location
	      
	      if(randomnum() < 4000) {
	    	  window.setColor(Color.WHITE);
	    	  window.fillOval(getX(),getY(),getWidth(),getHeight());
	      }
	      else{
	    	  window.setColor(getColor());
	    	  window.fillOval(getX(),getY(),getWidth(),getHeight());
	      }
	   }
	 
}
