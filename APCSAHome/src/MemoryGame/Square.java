package MemoryGame;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Square implements Locatable {

	private int xPos;
	private int yPos;

	public Square()
	{
		xPos = 0; 
		yPos = 0; 
	}

	public Square(int x, int y)
	{
		xPos = x; 
		yPos = y; 
	}

	public void setPos( int x, int y)
	{
		xPos = x; 
		yPos = y; 
	}


	public void setX(int x)
	{
		xPos = x; 
	}


	public void setY(int y)
	{
		yPos = y; 
	}

	public int getX()
	{
		return xPos;
	}


	public int getY()
	{
		return yPos;
	}
	
	public abstract void draw(Graphics window);
	
}
