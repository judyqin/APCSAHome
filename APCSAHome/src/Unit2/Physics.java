package Unit2;

import java.util.Scanner;

public class Physics {
	public static void main (String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter acceleration: ");
		double a = keyboard.nextDouble();
		
		System.out.println("Enter speed: ");
		double v = keyboard.nextDouble();
		
		double length = (v*v) / (2*a);
		
		System.out.println("The min runway length for this airplane is " + length);
	}
}

