package Unit6;

import static java.lang.System.*;

public class LoopStats
{
	private int start, stop;

	public LoopStats()
	{
		start = 0; 
		stop = 0; 

	}

	public LoopStats(int beg, int end)
	{
		setNums(beg, end);

	}

	public void setNums(int beg, int end)
	{
		start = beg; 
		stop = end;

	}

	public int getEvenCount()
	{
		int evenCount=0;
		for (int run = start; run <= stop; run++)
		{ 
			if (run  % 2 == 0)
			{
				evenCount++;
			}
		}

		return evenCount;
	}

	public int getOddCount()
	{
		int oddCount=0;
		
		for (int run = start; run <= stop; run++) 
		{ 
			if (run % 2 == 1)
			{
				oddCount++;
			}
		}

		return oddCount;
	}

	public int getTotal()
	{
		int total=0;
		
		for (int run = start; run <= stop; run++) 
		{ 
			total += run; 
		}

		return total;
	}
	
	public String toString()
	{
		return start + " " + stop;
	}
}