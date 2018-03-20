package Journal;

public class TenFactorial {
	
	public int run() { 

	int output = 1; 
	for (int i = 10; i > 0; i--) {
		output = output * i; 
	}
	return output; 
	}
	
	public void factorial(int x) {
		
		if (x<10) { 
			factorial(x+1);
			System.out.println(x); 
		}
		
	}
	public static void main(String args[]) {
		
		//System.out.println(10*9*8*7*6*5*4*3*2*1);

		TenFactorial t = new TenFactorial(); 
		System.out.println(t.run());
		
		TenFactorial x = new TenFactorial(); 
		x.factorial(10);
	}
}
