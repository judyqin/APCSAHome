package Unit1;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class RE1 extends Canvas {
	   public RE1()
	   {
		  setSize(800,600);
	      setBackground(Color.WHITE);   	
	      setVisible(true);
	   }

		public void update(Graphics window)
		{
			paint(window);
		}
	   
	   public void paint( Graphics window )
	   {
		   window.drawString("Rectangle 1: 7 x 6", 100, 90);
		   window.drawString("Rectangle 2: 10 x 11", 500, 90);

		   window.setColor(Color.BLACK);
		   window.drawRect(100,100,7,6);
		   window.drawRect(500, 100, 10, 11);
	   }
	 
}
