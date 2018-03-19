package Unit11AL;

public class OrchardRunner {

	public static void main(String args[]) {
		
		System.out.println("Welcome to Judy's Apple Tree Orchard\n");
	
		Orchard a = new Orchard("Fuji Tree", "Fuji", 6); 
		Orchard b = new Orchard("Granny Smith Tree", "Granny Smith", 9); 
		Orchard c = new Orchard("Gala Tree", "Gala", 25); 
		System.out.println("My orchard has the following apple trees: ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	
	}

}
