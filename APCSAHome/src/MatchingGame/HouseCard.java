package MatchingGame;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

public class HouseCard extends Square
{
	private Image image;
	private PinkCard back;
	
	public HouseCard()
	{
		this(0,0);
	}

	public HouseCard(int x, int y)
	{
		super(x, y);
		back = new PinkCard(x, y);
		try
		{
			image = ImageIO.read(new File("/Users/judyqin/git/APCSAHome/APCSAHome/src/MemoryGame/house.JPG"));
		}
		catch(Exception e)
		{
			System.out.println("HouseCard: we have a problem!");
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