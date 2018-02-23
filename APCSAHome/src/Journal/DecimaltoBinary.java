package Journal;

import java.util.Scanner;

public class DecimaltoBinary {
	public static void main (String[] args) { 
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a decimal integer between 0 and 255: ");
		int decimal = keyboard.nextInt();
		String binary; 
		int d = decimal;
		
		binary = "";
		
		for(int i = 7; i >= 0; i--)
		{
			if(d > (int)Math.pow(2, i))
			{
				d = d - d%(int)Math.pow(2, i);
			}
			if (d/Math.pow(2, i) == 1)
			{
				binary += "1";
			}
			else 
			{
				binary += "0"; 
			}
			d = decimal % (int)Math.pow(2, i);
		}
		
		
		
		System.out.println(binary);
	}
}