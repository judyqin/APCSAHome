package Unit13;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSort
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;

		do {
			number = number/10; 
			count++;
		} while (number > 0);
		
		return count;
	}
	
	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		
		for (int i = 0; i<sorted.length; i++) {
			sorted[i] = number%10; //gets each individual digit and puts in 
			number = number/10; //takes off the most right digit 
		}
		//System.out.println(Arrays.toString(sorted));
		
		int temp = 0; 
		for(int i=0; i<sorted.length;i++) {
			for (int j = 1+i; j<sorted.length; j++) {
				if (sorted[i] > sorted[j]) {
					temp = sorted[i];
					sorted[i] = sorted[j];
					sorted[j] = temp; 
					//System.out.println(Arrays.toString(sorted));
				}
				else {
					continue;
				}
			}
		}
		return sorted;
	}
	
}
