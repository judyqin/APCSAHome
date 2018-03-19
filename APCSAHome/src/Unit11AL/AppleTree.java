package Unit11AL;

public class AppleTree {
	
	private String appletype; 
	private Apple apples; 
	
	public AppleTree() {
	}
	
	public AppleTree(String a, String b, int num) {
		appletype = a; 
		apples = new Apple(b, num); 
	}
	
	public String toString() {
		String output = "";
		output += appletype + ": " + apples; 
		return output; 
	}
}
