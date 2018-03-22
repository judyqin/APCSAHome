package Unit14;

import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;
   private int atCount;
   private int first, second; 


	public AtCounter(int r, int c)
	{
		atCount=0;
		atMat = new char[][]{{'@','-','@','-','-','@','-','@','@','@'},
									{'@','@','@','-','@','@','-','@','-','@'},
									{'-','-','-','-','-','-','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','-','@'},
									{'-','@','-','@','-','@','-','@','-','@'},
									{'@','@','@','@','@','@','-','@','@','@'},
									{'-','@','-','@','-','@','-','-','-','@'},
									{'-','@','@','@','-','@','-','-','-','-'},
									{'-','@','-','@','-','@','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','@','@'}};
		first = r; 
		second = c; 
	}

	public int countAts(int r, int c)
	{

		//add in recursive code to count up the # of @s connected
		//start checking at spot [r,c]
		if (0 <= r && r <= 9 && 0 <= c && c <= 9) {
			if (atMat[r][c] == '@') {
				atMat[r][c] = 'v';
				atCount++; 
				countAts(r-1,c);
				countAts(r+1,c);
				countAts(r,c-1);
				countAts(r,c+1);
			}
			return atCount; 
		}
		else{
			return 0; 
		}
	}
	
	public int getAtCount()
	{
		return atCount;
	}
	

	public String toString()
	{
		String output="";
		output+= first + " " + second + " has " + getAtCount()+" @s connected.";
		return output;
	}
}