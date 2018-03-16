package Unit12;

import static java.lang.System.*;

public class WordL implements Comparable<WordL>
{
	private String word;

	public WordL( String s )
	{	
		word = s; 
	}
	
	public String getWord() {
		return word; 
	}
	
	public int length() {
		return word.length(); 
	}

	public int compareTo( WordL rhs )
	{
		if (word.length() > rhs.length()) {
			return 1; 
		}
		if (word.length() < rhs.length()) {
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