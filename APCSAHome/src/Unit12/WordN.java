package Unit12;

import static java.lang.System.*;

public class WordN implements Comparable<WordN>
{
	private String word;

	public WordN( String s)
	{
		word = s;
	}
	
	private String getWord(){
		return word; 
	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < vowels.length(); j++) {
				if (word.charAt(i) == vowels.charAt(j)) {
					vowelCount++; 
				}
			}			
		}
		return vowelCount;
	}

	public int compareTo(WordN rhs)
	{
		if (numVowels() > rhs.numVowels()) {
			return 1; 
		}
		if (numVowels() < rhs.numVowels()) {
			return -1; 
		}
		else {
			if (word.compareTo(rhs.getWord()) > 0) {
				return 1; 
			}
			if (word.compareTo(rhs.getWord()) < 0) {
				return -1; 
			}
			else {
				return 0;
			}
		}
	}

	public String toString()
	{
		return word;
	}
}