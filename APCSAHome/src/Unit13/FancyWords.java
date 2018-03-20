package Unit13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class FancyWords
{
	private String[] wordRay;

	public FancyWords(String sentence)
	{
		setWords(sentence);
	}

	public void setWords(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public String toString()
	{
		String output="";
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < wordRay.length; i++) {
			if (wordRay[i].length() > max) {
				max = wordRay[i].length(); 
			}
		}
		//System.out.println(max);
		
		for (int i = 0; i < wordRay.length; i++) {
			for (int j = max - wordRay[i].length(); j>0; j--) {
				wordRay[i] = " " + wordRay[i];
			}
		}
		
		//System.out.println(Arrays.toString(wordRay));
	
		for (int i = max; i>0; i--) {
		for (int j = wordRay.length-1; j >=0; j--) {
				System.out.print(wordRay[j].charAt(i-1));
			}
			System.out.print("\n");
		}
		
		return "\n";
	}
}