package Unit7;

import java.util.Scanner;
import static java.lang.System.*;
import java.util.Random; 

public class GuessingGame
{
	private int upperBound;
	private int random;
	private int response;

	public GuessingGame(int stop)
	{
		upperBound = stop; 

	}
	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		random = (int)Math.random() * upperBound + 1; 
		
		int run = 0; 
		do 
		{
			System.out.println("Enter a number between 1 and " + upperBound);
			response = keyboard.nextInt();
			run++;
		} while (random != response);
		
		System.out.println("It took you " + run + " guesses to guess " + random);
		System.out.println("You guessed wrong " + (100.0 - (1.0/run) * (100)) + " percent of the time");
		
	}

	public String toString()
	{
		String output="";
		return output;
	}
}