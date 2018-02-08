package Unit1;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      head(window);
      
      upperBody(window);
      
      lowerBody(window);
      
      //call other methods
      
   }

   public void head( Graphics window )
   {
	      window.setColor(Color.YELLOW);

	      window.fillOval(300, 100, 200, 100);
	      window.setColor(Color. BLACK); 
	      window.fillOval(350, 130, 10, 10);
	      window.fillOval(440, 130, 10, 10);
	      window.setColor(Color. RED); 
	      window.fillOval(395, 150, 8, 8);
	      window.setColor(Color. BLACK); 
	      window.drawArc(330, 50, 150, 135, 225, 90);

   }

   public void upperBody( Graphics window )
   {

		window.setColor(Color.BLUE);
		window.fillRect(335, 210, 130, 90);
	    window.setColor(Color. BLACK); 
		window.drawLine(335, 210, 280, 170);
		window.drawLine(465, 210, 520, 170);
   }

   public void lowerBody( Graphics window )
   {

		window.setColor(Color.GRAY);
		window.fillRect(335, 310, 130, 90);
	    window.setColor(Color. BLACK); 
		window.drawLine(335, 400, 280, 450);
		window.drawLine(465, 400, 520, 450);
		

   }
}