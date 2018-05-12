package MatchingGame;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

public class FlowerCard extends Square
{
	private Image image;
	private PinkCard back;

	public FlowerCard()
	{
		this(0,0);
	}

	public FlowerCard(int x, int y)
	{
		super(x, y);
		back = new PinkCard(x, y);
		try
		{
			image = ImageIO.read(new File("/Users/judyqin/git/APCSAHome/APCSAHome/src/MemoryGame/flower.JPG"));
		}
		catch(Exception e)
		{
			System.out.println("FlowerCard: we have a problem!");
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