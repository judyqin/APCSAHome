package Unit9;

//© A+ Computer Science  -  www.apluscompsci.com

//arrays worksheet 3

import static java.lang.System.*;
import java.util.Scanner;

public class ArrayWorksheetKey
{
	public static int equalToSeven(int[] array)
	{
	
	   int count=0;
	   for(int spot=0; spot<array.length; spot++)
	   {
	      if(array[spot]==7)
	        count++;
	   }
	   return count;
	}
	
	
	public static void main(String[] args)throws Exception
	{
		double[] decList = {9.0,8,7.5,10.5,3,4};
	   double total=0;
		for(int spot=0; spot<decList.length; spot++)
		{
		   total=total+decList[spot];
		}
		out.println(total);

		
		out.println("\n\n");
		
		int[] numList = {2,3,4,5,6,7,9,11,12,13,14,15,16};
		int count=0;
		for(int spot=0; spot<numList.length; spot++)
		{
		   if(numList[spot]%2==0)
		      count++;
		}
		out.println(count);
	
		
		out.println("\n\n");		
	
		int[] nums = new int[6];
		Scanner chop = new Scanner("1 2 7 8 9 11");
		
		int spot=0;
		while(chop.hasNextInt())
		{ 
		   nums[spot++]=chop.nextInt();
		} 
		double sum=0;
		for(spot=0; spot<nums.length; spot++)
		{
		   sum=sum+nums[spot];
		}
		out.println(String.format("%.2f",sum/nums.length));	
				
		
		out.println("\n\nPART 2\n");
		int[] ray = {1, 7, 3, 4, 5, 7, 6, 4, 6, 7, 8, 5, 4, 7};
		System.out.println("1 7 3 4 5 7 6 4 6 7 8 5 4 7  has " + equalToSeven(ray) + " 7s");				
	}
}