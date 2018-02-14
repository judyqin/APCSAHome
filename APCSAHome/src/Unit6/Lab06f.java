package Unit6;

import static java.lang.System.*;

public class Lab06f
{
	public static void main( String args[] )
	{
		//add test cases
		
		LetterRemover test = new LetterRemover("I am Sam I am", 'a');
		test.setRemover("I am Sam I am", 'a');
		System.out.println(test.toString());
		System.out.println(test.removeLetters());
		
		LetterRemover test2 = new LetterRemover();
		test2.setRemover("ssssssssxssssesssssesss", 's');
		System.out.println(test2.toString());
		System.out.println(test2.removeLetters());
		
		LetterRemover test3 = new LetterRemover();
		test3.setRemover("qwertyqwertyqwerty", 'a');
		System.out.println(test3.toString());
		System.out.println(test3.removeLetters());
		
		LetterRemover test4 = new LetterRemover();
		test4.setRemover("abababababa", 'b');
		System.out.println(test4.toString());
		System.out.println(test4.removeLetters());
		
		LetterRemover test5 = new LetterRemover();
		test5.setRemover("abaababababa", 'x');
		System.out.println(test5.toString());
		System.out.println(test5.removeLetters());
		
											
	}
}