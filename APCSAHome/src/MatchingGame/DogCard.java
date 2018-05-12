package MatchingGame;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

public class DogCard extends Square
{
	private Image image;
	private PinkCard back;

	public DogCard()
	{
		this(0,0);
	}

	public DogCard(int x, int y)
	{
		super(x, y);
		back = new PinkCard(x, y);
		try
		{
			image = ImageIO.read(new File("/Users/judyqin/git/APCSAHome/APCSAHome/src/MemoryGame/dog.JPG"));

		}
		catch(Exception e)
		{
			System.out.println("DogCard: we have a problem!");
		}
	}


	public void draw( Graphics window )
	{
		window.drawImage(image,getxPos(),getyPos(),80,80,null);
	}
	
	public void drawBack(Graphics window)
	{
		back.draw(window);
	}

	public String toString()
	{
		return super.toString();
	}
}