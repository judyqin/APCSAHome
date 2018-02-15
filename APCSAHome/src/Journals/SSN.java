package Journals;

import java.util.Scanner; 

public class SSN {

	public static void main(String [] args) {
		
		String one, two;
		boolean validity; 
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your social security number:: ");
		one = keyboard.nextLine();
		
		System.out.println("Enter social security number:: ");
		two = keyboard.nextLine();
	
		SSNChecker test = new SSNChecker(); 
		test.setSSNChecker(one, two);
		validity = test.compareSSN();
	
		if (validity == true) {
			System.out.println("The social security number is valid");
		}
		
		if (validity == false) {
			System.out.println("The social security number is invalid");
		}

	}

	
}
