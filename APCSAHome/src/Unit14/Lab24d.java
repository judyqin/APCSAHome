package Unit14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("lab24d.txt"));
		int num = file.nextInt(); 
		file.nextLine();
		
		for (int i = 0; i < num; i++) {
			String s = file.nextLine();
			TicTacToe test = new TicTacToe(s);
			System.out.println(test);
		}



	}
}


