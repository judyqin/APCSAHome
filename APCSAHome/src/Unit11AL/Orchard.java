package Unit11AL;

public class Orchard {

	public AppleTree o; 
	
	public Orchard() {
		
	}
	
	public Orchard(String a, String b, int num) {
		o = new AppleTree(a, b, num);
	}

	public String toString() {
		String output = "";
		output += o + " "; 
		return output; 
		
	}
	
}
