package Unit3;


import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;
	private String rounded; 
	private String rounded1; 
	
	public Quadratic()
	{
	
		   a = 0; 
		   b = 0; 
		   c = 0; 
		   rootOne = 0.0;
		   rootTwo = 0.0; 
		
	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		setEquation(quadA, quadB, quadC);

	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA; 
		b = quadB; 
		c = quadC; 

 	}

	public void calcRoots( )
	{
		System.out.println("\n\n");
		rootOne = (-(b)+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a); 
		rounded = String.format("%.2f", rootOne);
		System.out.println("rootone :: " + rounded);
		rootTwo = (-(b)-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a); 
		rounded1 = String.format("%.2f", rootTwo);
		System.out.println("roottwo :: " + rounded1 );
		
		
	}

	public void print( )
	{
		System.out.println("\n\n");

	}
}