package Unit11AL;
import java.util.Scanner; 

public class OrchardRunner {

	public static void main(String args[]) {
		
		String name; 
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your name?");
		name = keyboard.nextLine(); 
		System.out.println("Welcome to " + name + "\'s Apple Tree Orchard\n");
		
		String apptype; 
		int numsd; 
		int numappletree; 
		
		System.out.println("What type of apple tree do you have?");
		apptype = keyboard.nextLine(); 
	
		System.out.println("How many seeds does each apple have?");
		numsd = keyboard.nextInt(); 
		
		System.out.println("How many " + apptype + "Apple Trees do you have in your orchard?");
		numappletree = keyboard.nextInt();
	
		Orchard b = new Orchard(apptype + " Apple Tree ", apptype + " Apples ", numsd); 
		System.out.println("Your orchard has " + numappletree+ " of the following apple trees: ");
		System.out.println(b);

	
	}

}
