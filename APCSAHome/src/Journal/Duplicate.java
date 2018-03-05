package Journal;

import java.util.Arrays;
import java.util.Scanner; 

public class Duplicate {

	
	public static String Eliminated(int[] numbers)
	{
		String result = "";
		result += numbers[0] + " ";
		
		for (int i = 1; i < numbers.length; i++)
		{
			for (int j = 0; j < result.length() ; j++)
			{
				
				if (numbers[i] == result.charAt(j) - 48)
				{
					break; //found duplicate, no need to continue
				}
				else
				{
					if(j==result.length()-1) //has to wait until j is the last index of result
					{
						result += numbers[i] + " ";
					}
				}
			}
		}
		return result; 
	}
	
	public static void main(String[] args)
	{
		
		int[] test = {1, 2, 3, 2, 1, 6, 3, 4, 5, 2};
		System.out.println(Arrays.toString(test)); 
		System.out.println("The distinct numbers are " + Eliminated(test));
		
		int one, two, three, four, five, six, seven, eight, nine, ten; 
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number: ");
		one = keyboard.nextInt();
		System.out.println("Enter a number: ");
		two = keyboard.nextInt();
		System.out.println("Enter a number: ");
		three = keyboard.nextInt();
		System.out.println("Enter a number: ");
		four = keyboard.nextInt();
		System.out.println("Enter a number: ");
		five = keyboard.nextInt();
		System.out.println("Enter a number: ");
		six = keyboard.nextInt();
		System.out.println("Enter a number: ");
		seven = keyboard.nextInt();
		System.out.println("Enter a number: ");
		eight = keyboard.nextInt();
		System.out.println("Enter a number: ");
		nine = keyboard.nextInt();
		System.out.println("Enter a number: ");
		ten = keyboard.nextInt();
		
		int[] numbers = {one, two, three, four, five, six, seven, eight, nine, ten};
		System.out.println(Arrays.toString(numbers)); 
		System.out.println("The distinct numbers are " + Eliminated(numbers));
		
		
	}
}