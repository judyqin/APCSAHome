package Unit7;

import static java.lang.System.*;

public class TriangleThree

{
   private int size;
   private String letter;

	public TriangleThree()
	{
		size = 0; 
		letter = " ";
	}

	public TriangleThree(int count, String let)
	{
		setTriangle(count, let);
	}

	public void setTriangle(int sz, String let)
	{
		size = sz; 
		letter = let; 
	}

	public String getLetter()
	{
		String output = " ";
		int stop = size; 
		
		for(int r = 1; r <= stop; r++) 
		{
			for(int c = r; c <= stop; c++)
			{
				output = output + " ";
			}
			for (int k = 1; k <= r; k++)
			{
				output = output + letter; 
			}
			output = output + "\n";
		}
		return output; 
	}

	public String toString()
	{
		String output="";
		return output+"\n";
	}
}