package Unit4;

import static java.lang.System.*;

public class FirstAndLast
{
	private String word;
	private char firstLetter;
	private char lastLetter;
	private String converter; 
	private String converter2; 
	

	public FirstAndLast()
	{
		word = "Ravens";
		setString("Ravens");

	}

	public FirstAndLast(String s)
	{
		setString(s); 


	}

	public void setString(String s)
	{
		word = s; 

	}

	public void findFirstLastLetters()
	{
		firstLetter = word.charAt(0); 
		lastLetter = word.charAt(word.length() - 1);
		System.out.println("word:: " + word);
		System.out.println("first letter:: " + firstLetter);
		System.out.println("last letter:: " + lastLetter);
	}

 	public String toString()
 	{
 		return word; 
 	}
}
