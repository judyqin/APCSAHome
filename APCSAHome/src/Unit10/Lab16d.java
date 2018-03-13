package Unit10;

import static java.lang.System.*;

public class Lab16d
{
	public static void main( String args[] )
	{
		//System.out.println(System.getProperty("user.dir"));
		//make a new MadLib
		String madLibFile = "story.txt";
		MadLib mad = new MadLib(madLibFile);
		out.println(mad); 
		
	}
}