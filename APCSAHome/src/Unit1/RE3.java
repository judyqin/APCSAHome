package Unit1;

import java.util.Random; 

public class RE3 {

	public static void main(String[] args) {
		
		Random rand = new Random(); 
		int x = rand.nextInt(6) + 1; 
		System.out.println("You tossed a die.");
		System.out.print("You got " + x + ".");
		
		
	}
}
