package Unit11;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class GradeBookRunner
{
   public static void main( String args[] )
   {
	   	String className;
	   	int num; 
	   
		out.println("Welcome to the Class Stats program!");
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the name of this class?");
		className = keyboard.nextLine();
		
		System.out.println("How many students are in this class?");
		num = keyboard.nextInt(); 
		keyboard.nextLine();
		Class c = new Class(className, num);
		
		int i = 0;
		do {
			System.out.println("Enter the name of the student");
			String stuName = keyboard.nextLine(); 
			
			System.out.println("Enter the grades for " + stuName);
			System.out.println("Use the format x - grades (2 - 100 100)");
			String grades = keyboard.nextLine();
			
			Student s = new Student(stuName, grades);
			c.addStudent(i, s);
			
			i++;
		} while (i < num);
		
		System.out.println(c);
		
		
		System.out.println("Failure List = " + c.getFailureList(70));
		System.out.println("Highest Average = " + c.getStudentWithHighestAverage());
		System.out.println("Lowest Average = " + c.getStudentWithLowestAverage());
		System.out.println("Class average = " + c.getClassAverage());
   }
   
}

