package MemoryGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class FlowerCard extends Square
{
	private Image image;

	public FlowerCard()
	{
		this(0,0);
	}

	public FlowerCard(int x, int y)
	{
		super(x, y);
		try
		{
			image = ImageIO.read(new File("/Users/judyqin/git/APCSAHome/APCSAHome/src/MemoryGame/flower.JPG"));
		}
		catch(Exception e)
		{
			System.out.println("Houston we have a problem!");
		}
	}


	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),80,80,null);
	}

	public String toString()
	{
		return super.toString();
	}
}
