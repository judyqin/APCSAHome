package Journal;
import java.util.Scanner; 

public abstract class Animal {
	
	Scanner keyboard = new Scanner(System.in);
	private int legs; 
	private String food; 

	public Animal(int l, String f) {
		legs = l; 
		food = f; 
	}
	
	public int numLegs() {
		return legs; 
	}
	
	public String favFood() {
		return food; 
		
	}
	
	public String toString() {
		String output = "";
		output += " have " + legs + " legs and likes to eat " + food;
		return output; 
		
	}

}
