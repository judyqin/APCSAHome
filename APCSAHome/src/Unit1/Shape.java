package Unit1;

import java.awt.Color;
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

   public Shape(int x, int y, int wid, int ht, Color col)
   {
		xPos = x;
		yPos = y; 
		width = wid; 
		height = ht; 
		color = col; 
		//finish this constructor
   }


   public void draw(Graphics window)
   {

		window.setColor(color);
	    window.drawLine(xPos, yPos, 3*xPos, yPos);
	    window.drawLine(xPos, yPos, 2 * xPos, 2*yPos);
	    window.drawLine(3*xPos, yPos, 2*xPos, 2*yPos);
	    window.setColor(color);
	 
	    window.drawRect(xPos, yPos, width, height);
	    window.drawOval(xPos+100, yPos, 2*width, height);      }
   

      //draw whatever you want
      //    ^
      //  [ :: ]
      //    ()

public String toString()
{
	return xPos+" "+yPos+" "+width+" "+height+" "+color;
}
}