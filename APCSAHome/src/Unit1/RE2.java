package Unit1;

public class RE2 {
	public static void main (String [] args) {
		String h = "Hello World";
		
		
		String h1 = h.replace("e", "$");
		String h2 = h1.replace("o", "e");
		h2 = h2.replace("$", "o");
		
		
		System.out.println(h);
		System.out.println(h2);
	}
}
