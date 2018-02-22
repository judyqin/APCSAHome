package Unit8;

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	//instance variables
	private int num; 
	String g = " ";
	private double[] grades; 

	//constructor
	public Grades(int number, String grade)
	{
		setGrades(number, grade);
	}


	//set method
	public void setGrades(int number, String grade)
	{
		num = number; 
		g = grade; 
		
		grades = new double[number];
		
		Scanner keyboard = new Scanner(g);
		
		int count = 0;
		while (keyboard.hasNextDouble())
		{
			grades[count] = keyboard.nextDouble();
			count++;
		}
		
	}



	private double getSum()
	{
		double sum=0.0;
		for (int i = 0; i < grades.length; i++)
		{
			sum = sum + grades[i];
		}
		
		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		
		average = getSum()/num; 
	
		return average;
	}


	public String toString()
	{
		String output = "";
		
		for (int i = 0; i <grades.length; i++)
		{
			output += "grade" + i + ":: " + grades[i] + "\n";
		}
		
		output += "\naverage :: " + getAverage() + "\n";
		
		return output; 
	}

}