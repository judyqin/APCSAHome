package MatchingGame;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

public class BeachCard extends Square
{
	private Image image;
	private PinkCard back;

	public BeachCard()
	{
		this(0,0);
	}

	public BeachCard(int x, int y)
	{
		super(x, y);
		back = new PinkCard(x, y);
		try
		{
			image = ImageIO.read(new File("/Users/judyqin/git/APCSAHome/APCSAHome/src/MatchingGame/beach.JPG"));

		}
		catch(Exception e)
		{
			System.out.println("BeachCard: we have a problem!");
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
