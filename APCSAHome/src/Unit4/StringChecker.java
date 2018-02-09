package Unit4;

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{
		word = ""; 

	}

	public StringChecker(String s)
	{
		setString(s);

	}

   public void setString(String s)
   {
   		word=s;
   }

	public boolean findLetter(char c)
	{
		if (-1 != word.indexOf(c))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean findSubString(String s)
	{
		if (-1 != word.indexOf(s))
		{
			return true; 
		}
		else 
		{
			return false; 
		}
	}

 	public String toString()
 	{
 		return "\n\n";
	}
}