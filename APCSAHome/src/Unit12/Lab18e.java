package Unit12;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{

		Scanner file = new Scanner(new File("lab18e.txt"));

		int size = file.nextInt();
		file.nextLine();
		
		ArrayList<WordN> list = new ArrayList<WordN>(size); 
		
		while (file.hasNextLine()) {
			list.add(new WordN(file.nextLine()));
		}
		
		Collections.sort(list); 
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); 
		}


	}
}