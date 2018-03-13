package Unit10;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();
		
	}

	public Histogram(char[] values, String fName)
	{
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();
		fileName = fName; 
		
		for (char i: values)
		{
			letters.add(i);
			count.add(0);
		}
		
		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		Scanner file = new Scanner(new File(fileName));
			while (file.hasNextLine())
			{
				String s = file.nextLine();
				for (char c : s.toCharArray())
				{
					for (int i = 0; i < count.size(); i++)
					{
						if (c == letters.get(i))
						{
							count.set(i, count.get(i) + 1);
						}
					}
				}
			}
	}

	public char mostFrequent()
	{

		int a = 0; 
		int b = 0; 
		for (int i = 0; i < count.size(); i++)
		{
			if (a > count.get(i))
			{
				continue;
			}
			else if (count.get(i) > a)
			{
				a = count.get(i);
				b = i; 
			}
		}
		return letters.get(b);
	}

	public char leastFrequent()
	{
		int a = count.get(0);
		int b = 0;
		for (int i = 0; i < count.size(); i++){
			if(a < count.get(i)){
				continue;
			}
			else if (count.get(i) < a){
				a = count.get(i);
				b = i;
			}
		}
		return letters.get(b);
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}