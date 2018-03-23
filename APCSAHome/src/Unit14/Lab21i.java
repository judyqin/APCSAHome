package Unit14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		
		Scanner file = new Scanner(new File("lab21i.txt"));
		int i = file.nextInt(); 
		file.nextLine(); 
		String l = file.nextLine();
		Maze test = new Maze(i, l);
		System.out.println(test);
		
		i = file.nextInt(); 
		file.nextLine(); 
		l = file.nextLine();
		Maze test1 = new Maze(i, l);
		System.out.println(test1);
		
		i = file.nextInt(); 
		file.nextLine(); 
		l = file.nextLine();
		Maze test2 = new Maze(i, l);
		System.out.println(test2);
		
		i = file.nextInt(); 
		file.nextLine(); 
		l = file.nextLine();
		Maze test3 = new Maze(i, l);
		System.out.println(test3);
		
		i = file.nextInt(); 
		file.nextLine(); 
		l = file.nextLine();
		Maze test4 = new Maze(i, l);
		System.out.println(test4);
		
		i = file.nextInt(); 
		file.nextLine(); 
		l = file.nextLine();
		Maze test5 = new Maze(i, l);
		System.out.println(test5);
		
		
	}
}