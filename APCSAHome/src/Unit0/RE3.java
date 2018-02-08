package Unit0;


public class RE3 {

	public static void main(String[] args) {
	
		 float yearZero = 312032486f;
		  
		 float birth = (60 * 60 * 24 * 365) / 7f; 
		 float death = (60 * 60 * 24 * 365)/13f;
		 float immigrant = (60 * 60 * 24 * 365)/45f;
		
		double yearOne = yearZero + (1 * birth) - (1 * death) + (1 * immigrant); 
		double yearTwo = yearZero + (2 * birth) - (2 * death) + (2 * immigrant); 
		double yearThree = yearZero + (3 * birth) - (3 * death) + (3 * immigrant); 
		double yearFour = yearZero + (4 * birth) - (4 * death) + (4 * immigrant); 
		double yearFive = yearZero + (5 * birth) - (5 * death) + (5 * immigrant);
		
		System.out.println("Predicted Year One Population: " + yearOne); 
		System.out.println("Predicted Year Two Population: " + yearTwo); 
		System.out.println("Predicted Year Three Population: " + yearThree); 
		System.out.println("Predicted Year Four Population: " + yearFour); 
		System.out.println("Predicted Year Five Population: " + yearFive); 
		
	}
	
}

