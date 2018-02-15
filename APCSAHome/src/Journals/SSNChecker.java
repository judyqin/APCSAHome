package Journals;

public class SSNChecker {

	private String firstssn; 
	private String secondssn;
	
	public SSNChecker() {
		
		firstssn = " ";
		secondssn = " ";		
	}
	
	public SSNChecker(String first, String second) { 
		setSSNChecker(first, second);
	}
	 	
	 	
	 public void setSSNChecker(String first, String second) { 
		 firstssn = first; 
		 secondssn = second;  
	 }
	
	 public boolean compareSSN() {
		 
		 boolean output = true; 
		 
		 for(int c = 0; c < firstssn.length(); c++) 
		 {
			 if (firstssn.charAt(c) == secondssn.charAt(c))
			 {
				 output = true; 
			 }
			 else if(firstssn.charAt(c) != secondssn.charAt(c))
			 {
				 output = false;
				 return output;
			 }
		 }
		 return output;
		 
	 }
	
	
}
