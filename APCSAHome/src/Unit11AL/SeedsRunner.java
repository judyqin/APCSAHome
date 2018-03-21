package Unit11AL;
import java.util.Scanner; 

public class SeedsRunner {

	public static void main(String args[]) {
		
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("How many seeds does your apple have?"); 
		int numseed = keyboard.nextInt(); 
		
		Seeds s = new Seeds(numseed); 
		System.out.println(s.toString());
	}
}
