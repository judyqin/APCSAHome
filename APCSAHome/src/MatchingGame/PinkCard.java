package MatchingGame;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

public class PinkCard extends Square
{
	private Image image;

	public PinkCard()
	{
		this(0,0);
	}

	public PinkCard(int x, int y)
	{
		super(x, y);
		try
		{
			image = ImageIO.read(new File("/Users/judyqin/git/APCSAHome/APCSAHome/src/MemoryGame/pink.JPG"));

		}
		catch(Exception e)
		{
			System.out.println("PinkCard: we have a problem!");
		}
	}


	public void draw( Graphics window )
	{
		window.drawImage(image,getxPos(),getyPos(),80,80,null);
	}
	
	public void drawBack(Graphics window)
	{
		draw(window);
	}
	
	public String toString()
	{
		return super.toString();
	}
}