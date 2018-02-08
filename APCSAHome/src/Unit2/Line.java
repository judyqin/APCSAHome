package Unit2;

public class Line
{
	private int xOne,yOne, xTwo, yTwo;
	private double slope;
	private String rounded; 
	

	public Line(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1, y1, x2, y2);

	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calculateSlope( )
	{
		slope = (double)(yTwo - yOne) / (xTwo - xOne);
		rounded = String.format("%.2f", slope);
	}

	public void print( )
	{
		System.out.println("The slope is " + rounded);
	}
}