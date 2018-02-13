package Unit5;

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
		theChar = '0';

	}

	public CharacterAnalyzer(char c)
	{

		setChar(c);
	}

	public void setChar(char c)
	{
		theChar = c; 

	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper()
	{
		
		if(65 <= theChar) 
			if (theChar <= 90)
				return true; 


	return false;
	
	}

	public boolean isLower( )
	{

		if(97 <= theChar) 
			if (theChar <= 122)
				return true; 

		return false;
	}
	
	public boolean isNumber( )
	{
		if(48 <= theChar) 
			if (theChar <= 57)
				return true; 

		return false;
	}	

	
	public int getASCII( )
	{
		return (int)theChar; 
	}

	
	public String toString()
	{
 		
		if (isUpper())
		{
			return ""+getChar() + " is an uppercase character. ASCII == " + getASCII() + "\n";	  
		}
		if (isLower())
		{
			return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";	  
		}
		if(isNumber())
		{
			return ""+getChar() + " is a number. ASCII == " + getASCII() + "\n";	  
		}
		else
		{
			return null;
		}
		
	}
}