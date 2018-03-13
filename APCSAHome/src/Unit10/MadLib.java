package Unit10;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;
import java.util.Random; 

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	private String madlib; 
	private Random rand; 
	
	public MadLib()
	{
		verbs = new ArrayList<String>(); 
		nouns = new ArrayList<String>(); 
		adjectives = new ArrayList<String>(); 
		
		loadNouns();
		loadVerbs(); 
		loadAdjectives(); 
		rand = new Random(); 
	}

	public MadLib(String fileName)
	{
		verbs = new ArrayList<String>(); 
		nouns = new ArrayList<String>(); 
		adjectives = new ArrayList<String>(); 
		
		loadNouns();
		loadVerbs(); 
		loadAdjectives(); 
		rand = new Random(); 
		
		try{
			Scanner file = new Scanner(new File(fileName));
			madlib = "";
			
			while (file.hasNext())
			{
				String next = file.next(); 
				
				if (next.equals("#"))
				{
					madlib += getRandomNoun(); 
				}
				else if (next.equals("@"))
				{
					madlib += getRandomVerb(); 
				}
				else if (next.equals("&"))
				{
					madlib += getRandomAdjective(); 
				}
				else 
				{
					madlib += next; 
				}
				madlib += " ";
			}

		
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
		
		Scanner n = new Scanner(new File("nouns.txt"));
		
		while (n.hasNext())
			{
				nouns.add(n.next()); 
			}
		
		
		}
		catch(Exception e) {}	
		
		
	}
	
	public void loadVerbs()
	{
		try{
		
		Scanner v = new Scanner(new File("verbs.txt"));
		
		while (v.hasNext())
			{
				verbs.add(v.next()); 
			}
	
		}
		catch(Exception e){}
	}

	public void loadAdjectives()
	{
		try{
		
		Scanner a = new Scanner(new File("adjectives.txt"));
		
		while (a.hasNext())
			{
				adjectives.add(a.next()); 
			}
	
		}
		catch(Exception e){}
	}

	public String getRandomVerb()
	{
		return verbs.get(rand.nextInt(verbs.size()));

	}
	
	public String getRandomNoun()
	{
		return nouns.get(rand.nextInt(nouns.size()));
	}
	
	public String getRandomAdjective()
	{
		return adjectives.get(rand.nextInt(adjectives.size()));
	}		

	public String toString()
	{
	   return madlib;
	}
}