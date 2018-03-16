package Unit12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.lang.System.*;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("lab18d.txt"));

		int size = file.nextInt();
		file.nextLine();
		
		ArrayList<WordL> list = new ArrayList<WordL>(size); 
		
		while (file.hasNextLine()) {
			list.add(new WordL(file.nextLine()));
		}
		
		Collections.sort(list); 
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); 
		}
		
		
	}
}