package Journal;


import java.util.Random; 
import java.util.Arrays; 



public class RandomDigitsRunner {
	
	public static int[] randInts()
	{
	
		int[] numbs = new int[100];
		
		Random rand = new Random(); 
	
		for (int i = 0; i < numbs.length; i++)
		{
			numbs[i] += (int)(Math.random() * 10); 
		}
		return numbs; 
	
	}
	
	public static int[] getCounts(int[] numbs)
	{
		
		int counts[] = new int[10]; 
		
		for (int c = 0; c < 10 ; c++)
		{
			for (int i = 0; i < numbs.length; i++)
			{
				if (numbs[i] == c)
				{
					counts[c] += 1;
				}
			}
		}
		
		return counts; 
	}


	public static void main(String[] args) 
	{
		
		int[] numbs = randInts(); 
		System.out.println(Arrays.toString(numbs));
		System.out.println("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]");
		System.out.println(Arrays.toString(getCounts(numbs)));
	
		
	}
}