package Unit3;

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
   {
   	
		Scanner keyboard = new Scanner(System.in);

		//ask for user input
		System.out.print("Enter side A ::  ");
		int quadA = keyboard.nextInt();

		System.out.print("Enter side B ::  ");
		int quadB = keyboard.nextInt();

		System.out.print("Enter side C ::  ");
		int quadC = keyboard.nextInt();


		Quadratic test = new Quadratic(quadA, quadB, quadC);
		test.calcRoots();
		test.print();
   	
   	
		
		
	}
}