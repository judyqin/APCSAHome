package Journal;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Count {
	
	public static int[] nums; 
	
	 public static int[] makeArray(int[] s) {
		 
		    int size = s.length;
		    nums = new int[size];
		    for(int i =0;i<size;i++){
		      nums[s[i]]++;
		    }
		    return nums;
		  }
	 
	 public static int linearSearch(int[] s, int findnum) {
		 
		 int i=0;
		 while (i<s.length){
			if (s[i] == findnum){
				return i;
			}
			 i++;
		 }
		 return -1;
	 }

	public static void main(String[] args) {
		
		int count = 0; 
		
		do {
			int[] n = new int[100];
	    	for(int i =0;i<100;i++){
	    		n[i] = (int)(Math.random()*100);
	    	}
	    	int[] numbers = makeArray(n);
	    	System.out.println(Arrays.toString(numbers));
	    	long start = System.nanoTime();
	    	System.out.println(linearSearch(n, 2));
	    	long end = System.nanoTime();
	    	System.out.println("Took: " + ((end - start) / 1000) + " milliseconds");
	    	start = System.nanoTime();
	    	System.out.println(Arrays.binarySearch(n, 2));
	    	end = System.nanoTime();
	    	System.out.println("Took: " + ((end - start) / 1000) + " milliseconds");
	    	System.out.println("");
	    	count++;
		} while(count <= 10);
	  }
}