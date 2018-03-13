package Unit11;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Student implements Comparable
{
	private String myName;
	private Grades myGrades;
	
	public Student()
	{
		setName("");
		setGrades("");
	}
	
	public Student(String name, String gradeList)
	{
		setName(name);
		setGrades(gradeList);
	}
	
	public void setName(String name)
	{
		myName = name; 
	}	
	
	public void setGrades(String gradeList)
	{	
		myGrades = new Grades(gradeList);
	}
	
	public void setGrade(int spot, double grade)
	{
		myGrades.setGrade(spot, grade);

	}

	public String getName()
	{
		return myName;
	}
	
	public int getNumGrades()
	{
		return myGrades.getNumGrades();
	}

	public double getSum()
	{
		return myGrades.getSum();
	}
	
	public double getAverage()
	{
		double avg = 0.0; 
		avg = myGrades.getSum()/myGrades.getNumGrades();
		return avg; 
	}

	public double getAverageMinusLow()
	{
		double aml = 0.0;
		aml = (myGrades.getSum() - myGrades.getLowGrade()) / (myGrades.getNumGrades() -1); 
		return aml; 
	}
	
	public double getHighGrade()
	{
		return myGrades.getHighGrade();		
	}
	
	public double getLowGrade()
	{
		return myGrades.getLowGrade();	
	}
	
	public boolean equals(Object x)
	{
		Student s = (Student)x;
		if (getAverage() == s.getAverage())
			return true; 
		else
			return false; 
	}
	
	public int compareTo(Object x) {
	Student s=(Student)x;
		if (getAverage() - s.getAverage() > 0)
			return 1; 
		else if (getAverage() - s.getAverage() == 0)
			return 0; 
		else
			return -1; 
	}
	
	public String toString()
	{
		String output = "";;
		output += getName(); 
		output += "-" + myGrades.toString(); 
		return output; 
		
	}	
}