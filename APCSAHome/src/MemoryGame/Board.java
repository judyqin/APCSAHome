package MemoryGame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random; 


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
	private PinkCards pinks; 
	private PinkCard[][] pinkmat; 
	private int rand1, rand2, rand3, rand4; 

	private BufferedImage back;

	public Board()
	{
		setBackground(Color.WHITE);
		
		balloon = new BalloonsCard(200, 150);
		beach = new BeachCard(400, 150);
		cup = new CupcakeCard(600, 150);
		dog = new DogCard(800, 150);
		flower2 = new FlowerCard(200, 300);
		ic = new IceCreamCard(400, 300);
		pg = new PigCard(600, 300);
		flower = new FlowerCard(800, 300);
		cup2 = new CupcakeCard(200, 450); 
		house = new HouseCard(400, 450);
		beach2 = new BeachCard(600, 450);
		pg2 = new PigCard(800, 450);
		dog2 = new DogCard(200, 600);
		balloon2 = new BalloonsCard(400, 600);
		house2 = new HouseCard(600, 600);
		ic2 = new IceCreamCard(800, 600);
		pinks = new PinkCards(200, 150);
		pinkmat = pinks.pMatrix(); 
//		rand1 = (int)(Math.random() * 4 + 1);
//		rand2 = (int)(Math.random() * 4 + 1);
//		rand3 = (int)(Math.random() * 4 + 1);
//		rand4 = (int)(Math.random() * 4 + 1);
		
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
		balloon.draw(window);
		beach.draw(window);
		cup.draw(window);
		dog.draw(window);
		flower.draw(window);
		house.draw(window);
		ic.draw(window);
		pg.draw(window);
		balloon2.draw(window);
		beach2.draw(window);	
		cup2.draw(window);
		dog2.draw(window);
		flower2.draw(window);
		house2.draw(window);
		ic2.draw(window);
		pg2.draw(window);
		
		for (int i = 0; i < pinkmat.length; i++) {
			for (int j = 0; j < pinkmat[i].length; j++) {
				pinkmat[i][j].draw(window);
			}
		}
	
		
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
