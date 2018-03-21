package Unit11AL;
import java.util.Scanner; 

public class AppleTreeRunner {

	public static void main(String args[] ) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String atype; 
		int ns; 
		
		System.out.println("What type of apple tree do you have?");
		atype = keyboard.nextLine(); 
	
		System.out.println("How many seeds does your apple have?");
		ns = keyboard.nextInt(); 

		
		AppleTree a = new AppleTree(atype + " Tree", atype + " Apples", ns); 
		System.out.println(a);
		
		
	}
}
