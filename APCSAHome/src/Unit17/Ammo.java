//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

package Unit17; 
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;

	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		this(x,y,0); 
	}

	public Ammo(int x, int y, int s)
	{
		super(x,y);
		speed = s; 
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
		window.setColor(Color.PINK);
		window.fillRect(getX(), getY(), 7, 7);
	}

	public String toString()
	{
		return "";
	}
}
