package Unit5;

import static java.lang.System.*;
import java.util.Scanner;

public class Lab05d
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a letter :: ");
		char letter = keyboard.next().charAt(0);
		CharacterAnalyzer test = new CharacterAnalyzer(letter);
		out.println(test);
		
		out.print("Enter a letter :: ");
		char letter1 = keyboard.next().charAt(0);
		CharacterAnalyzer test1 = new CharacterAnalyzer(letter1);
		out.println(test1);
		
		out.print("Enter a letter :: ");
		char letter2 = keyboard.next().charAt(0);
		CharacterAnalyzer test2 = new CharacterAnalyzer(letter2);
		out.println(test2);
		

	}
}