package Unit17; 
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class PowerUp extends MovingThing
{
	private int speed;
	private Image image;

	public PowerUp()
	{
		this(0,0,0);
	}

	public PowerUp(int x, int y)
	{
		this(x,y,0);
	}

	public PowerUp(int x, int y, int s)
	{
		super(x, y);
		speed=s;
		try
		{
			image = ImageIO.read(new File("/Users/judyqin/git/APCSAHome/APCSAHome/src/Unit17/powerup.JPG"));
		}
		catch(Exception e)
		{
			System.out.println("Houston we have a problem!");
		}
	}

	public void setSpeed(int s)
	{
	   speed = s; 
	}

	public int getSpeed()
	{
	   return speed; 
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),80,80,null);
	}

	public String toString()
	{
		return "";
	}
}

