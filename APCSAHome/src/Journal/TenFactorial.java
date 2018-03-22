package Journal;

public class TenFactorial {
	
	int fact = 1; 
	
	public int run() { 

	int output = 1; 
	for (int i = 10; i > 0; i--) {
		output = output * i; 
	}
	return output; 
	}
	
	public int factorial(int x) { 
	
	if (x == 1) {
		return fact; 
	}
	else {
		fact = factorial(x-1) * x;
		return fact; 
	}
		
	}
	public static void main(String args[]) {
		
		//System.out.println(10*9*8*7*6*5*4*3*2*1);

		TenFactorial t = new TenFactorial(); 
		System.out.println(t.run());
		
		TenFactorial x = new TenFactorial(); 
		System.out.println(x.factorial(10));
	}
}
