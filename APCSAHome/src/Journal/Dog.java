package Journal;

public class Dog extends Animal {

	public Dog(int l, String f) {
		super(l, f);
	}
	
	
	public static void main(String args[]) {
		Animal test = new Dog(4, "bones"); 
		System.out.println("Dogs" + test.toString());
		
	}

}
