package Unit11AL;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

import java.util.ArrayList;

public class Grades
{ 
	private ArrayList<Grade> gradeList; 
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String values)
	{
		setGrades(values);		
	}
	
	public void setGrades(String values)
	{
		gradeList = new ArrayList<Grade>();
		Scanner n = new Scanner(values);
		int count = n.nextInt();
		n.next();
		int i = 0; 
			while (n.hasNext()) {
				gradeList.add(new Grade(Double.parseDouble(n.next())));
				i++; 
			} 
	}
	
	public void setGrade(int spot, double grade)
	{
		gradeList.set(spot, new Grade(grade));
	}
	
	public double getSum()
	{
		double sum=0.0;
		for (int i = 0; i < gradeList.size(); i++) {
			sum += gradeList.get(i).getNumericGrade();
		}
		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		for (int i = 0; i < gradeList.size(); i++) {
			if (low > gradeList.get(i).getNumericGrade()) {
				low = gradeList.get(i).getNumericGrade();
			}
		}
		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		for (int i = 0; i < gradeList.size(); i++) {
			if (gradeList.get(i).getNumericGrade() > high) {
				high = gradeList.get(i).getNumericGrade();
			}
		}
		return high;
	}
	
	public int getNumGrades()
	{
		return gradeList.size();
	}
	
	public String toString()
	{
		String output="";
		for (int i = 0; i<gradeList.size(); i++) {
			output += gradeList.get(i).getNumericGrade() + " ";
		}
		return output;
	}	
}