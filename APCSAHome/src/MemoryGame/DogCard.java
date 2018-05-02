package MemoryGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class DogCard extends Square
{
	private Image image;

	public DogCard()
	{
		this(0,0);
	}

	public DogCard(int x, int y)
	{
		super(x, y);
		try
		{
			image = ImageIO.read(new File("/Users/judyqin/git/APCSAHome/APCSAHome/src/MemoryGame/dog.JPG"));
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

