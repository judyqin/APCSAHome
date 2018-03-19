package Journal;

import java.util.Arrays; 

public class Count {
	
	public static void main(String args[]) {
		
		int[] digits = {1,4,5,6,87,24,70,40,69,10,52,9,5,40,10,99,0};
		int[] temp = digits;
		 
		System.out.println(Arrays.toString(digits));
		Arrays.sort(digits);
		
		for (int i = 0; i < digits.length -1; i++) {
			for (int j = 1;j < digits.length; j++) {
				int count = 0; 
				if (digits[i] == digits[j]) {
					count ++; 
					System.out.println(digits[i] + ": " + count); 
				}
			}
		}
		
	}
}
