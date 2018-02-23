package Journal;

import java.util.Scanner; 
import Journal.ReversePalindromeRunner;

public class ReversePalindromeRunner
{
	public static void main( String args[] )
	{
		//add test cases
		
		int num;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number: " );
		num = keyboard.nextInt();
		
		Reverse test = new Reverse(num);
		
		if (test.isPalindrome(num))
		{
			System.out.println(num + " is a palindrome");
		}
		else
		{
			System.out.println(num + " is not a palindrome");
		}
	
	}
}