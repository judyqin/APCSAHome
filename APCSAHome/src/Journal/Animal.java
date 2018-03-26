package Journal;
import java.util.Scanner; 

public class Animal {
	
	Scanner keyboard = new Scanner(System.in); 

	public Animal() {
		
	}
	
	public int numLegs() {
		System.out.println("How many legs does your animal have?");
		int legs = keyboard.nextInt(); 
		return legs; 
	
	}
	
	public String favFood() {
		System.out.println("What does your animal like to eat?");
		String food = keyboard.next(); 
		return food; 
		
	}
	
	public static void main(String args[]) {
		Animal test = new Animal(); 
		test.numLegs();
		test.favFood();
	}
	
}
