package Unit9;

import java.util.Arrays; 

public class Permutations {
	
	public static boolean arePermutations(int[] a, int[] b)
	{
	    Arrays.sort(a);
	    Arrays.sort(b);
	    for (int i = 0; i < a.length; i++)
	    {
	      if (a[i] != b[i])
	      {
	        return false;
	      }
	    }
	    return true;
	 }

	public static void main(String[] args) 
	{
		int[] a= {1, 2, 3, 4, 5, 6, 7};
		int[] b= {7, 6, 5, 4, 3, 2, 1};
		System.out.println(arePermutations(a, b));
	}
}
