package Unit9;

import java.util.Random; 

public class Flip {
	
	public static String Flip()
	{
		Random rand = new Random();
		int flip = rand.nextInt(3); 
		String output = "";
		
		if (flip == 1 || flip == 2)
		{
			output += "It is heads"; 
		}
		else 
		{
			output += "It is tails";
		}
		return output; 
	}

	public static void main(String[] args)
	{
		for (int i=0; i<12; i++)
		{
			System.out.println(Flip());
		}
	}
}
