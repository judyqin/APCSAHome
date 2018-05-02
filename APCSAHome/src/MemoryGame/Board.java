package MemoryGame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Board extends Canvas implements Runnable {
	
//uncomment once you are ready for this part

	private BalloonsCard balloon, balloon2; 
	private BeachCard beach, beach2; 
	private CupcakeCard cup, cup2; 
	private DogCard dog, dog2; 
	private FlowerCard flower, flower2; 
	private HouseCard house, house2; 
	private IceCreamCard ic, ic2; 
	private PigCard pg, pg2; 
	

	private BufferedImage back;

	public Board()
	{
		setBackground(Color.WHITE);
		
		balloon = new BalloonsCard(200, 150);
		beach = new BeachCard(400, 150);
//		cup = new CupcakeCard(600, 150);
//		dog = new DogCard(800, 150); 
//		flower = new FlowerCard(200, 300); 
//		house = new HouseCard(400, 300);
//		ic = new IceCreamCard(600, 300);
//		pg = new PigCard(800, 300);
		balloon2 = new BalloonsCard(400, 300);
		beach2 = new BeachCard(200, 300);

	
		//instantiate other stuff


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

		window.setColor(Color.BLACK);
		window.drawString("MEMORY GAME ", 25, 50 );
		window.setColor(Color.PINK);
//		window.drawRect(200, 150, 240, 300);
		balloon.draw(window);
		beach.draw(window);
//		cup.draw(window);
//		dog.draw(window);
//		flower.draw(window);
//		house.draw(window);
//		ic.draw(window);
//		pg.draw(window);
		balloon2.draw(window);
		beach2.draw(window);	
		
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
