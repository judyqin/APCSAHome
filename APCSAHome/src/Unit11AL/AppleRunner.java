package Unit11AL;
import java.util.Scanner; 

public class AppleRunner {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What type of apple do you have?");
		String appletype = keyboard.nextLine(); 
		System.out.println("How many seeds does your apple have?"); 
		int numseed = keyboard.nextInt(); 
		
		Apple a = new Apple(appletype, numseed); 
		System.out.println(a);
	}
}
