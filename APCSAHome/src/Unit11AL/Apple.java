package Unit11AL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Apple {

	private ArrayList<Seeds> apples = new ArrayList<Seeds>(); 
	private String appletype; 
	
	public Apple() {
		setApples(""); 
		setSeeds(0);
	}
	
	public Apple(String a, int num) {
		setApples(a); 
		setSeeds(num);
	}
	
	public void setApples(String a) {
		appletype = a; 
	}
	
	public void setSeeds(int num) {
		apples.add(0, new Seeds(num));
	}
	
	public String toString() {
		String output= appletype + " ";
		for (int i = 0; i < apples.size(); i++) {
			output += apples.get(i);
		}
		return output;
	}

}
