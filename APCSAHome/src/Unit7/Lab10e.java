
package Unit7;


import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		int response;
		String answer; 
	
		do {
		System.out.println("Guessing Game - how many numbers?" );
		response = keyboard.nextInt();
		
		GuessingGame test = new GuessingGame(response); 
		test.playGame();
		System.out.println(test);

		System.out.println("Do you want to play again? y or n");
		answer = keyboard.nextLine();
		System.out.println("\n\n");
		
		} while (answer.equals("y"));
	}
}