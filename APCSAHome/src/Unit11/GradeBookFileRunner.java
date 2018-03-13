package Unit11;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner file = new Scanner(new File("gradebook.txt"));
		String className = file.nextLine();
		int num = file.nextInt(); 
		file.nextLine();
		Class c = new Class(className, num);
		
		for (int i = 0; i < num; i++) {
			String stuName = file.nextLine(); 
			String grades = file.nextLine();
			Student s = new Student(stuName, grades);
			c.addStudent(i, s);
		}
	
		System.out.println(c);
		
		System.out.println("Failure List = " + c.getFailureList(70));
		System.out.println("Highest Average = " + c.getStudentWithHighestAverage());
		System.out.println("Lowest Average = " + c.getStudentWithLowestAverage());
		System.out.println("Class average = " + c.getClassAverage());
		c.sort();
		System.out.println(c);
		
   }
}
