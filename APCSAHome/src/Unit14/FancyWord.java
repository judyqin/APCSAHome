package Unit14;

import java.util.Scanner;
import static java.lang.System.*;

public class FancyWord
{
	private char[][] mat;
	private String word; 

	public FancyWord()
	{
		mat = new char[0][0];
	}

   public FancyWord(String s)
	{
	   word = s; 
	   int size = s.length();
	   mat = new char[size][size];
	   
	   for (int i = 0; i < s.length(); i++) {
		   mat[0][i] = s.charAt(i);
		   mat[i][i] = s.charAt(i);
		   mat[i][(s.length()-1)-i] = s.charAt((s.length()-1)-i);
		   mat[s.length()-1][i] = s.charAt(i);
	   }
	   
	}
 

   public String toString()
	{
		String output="";
		for (int i =0; i < word.length(); i++){
			for (int j = 0; j < word.length(); j++){
				output += mat[i][j];
			}
			output += "\n";
		}
		return output+"\n\n";
	}
}