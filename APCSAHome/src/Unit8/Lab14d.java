package Unit8;

import java.util.Arrays;

public class Lab14d
{
	public static void main( String args[] )
	{
		//add test cases
		
		int n = 5; 
		String grds = "100.0 90.0 85.0 72.5 95.6";

		Grades test = new Grades(n, grds);
		System.out.println(test.toString());
		
	}
}