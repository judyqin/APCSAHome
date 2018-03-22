package Unit14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		int i; 
		
		Scanner file = new Scanner(new File("lab21i.txt"));
		i = file.nextInt(); 
		file.nextLine(); 
		
		String l = file.nextLine();
		Maze test = new Maze(i, l);
		
		
	}
}