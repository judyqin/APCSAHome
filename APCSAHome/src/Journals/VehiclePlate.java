package Journals;

import java.util.Random; 

public class VehiclePlate {

	
	public static void main(String[] args) {
	Random r = new Random(); 

	
	String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	int num1 = r.nextInt(26); 
	char letter1 = (alphabet.charAt(num1));
	
	int num2 = r.nextInt(26); 
	char letter2 = (alphabet.charAt(num2));
	
	int num3 = r.nextInt(26); 
	char letter3 = (alphabet.charAt(num3));
	
	int one = r.nextInt(9); 
	int two = r.nextInt(9); 
	int three = r.nextInt(9); 
	int four = r.nextInt(9); 
	
	System.out.println("Vehicle Plate: " + letter1 + letter2 + letter3 + one + two + three + four);
	
	}
	
}