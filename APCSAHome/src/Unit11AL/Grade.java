package Unit11AL;

public class Grade {

	private double value; 
	
	public Grade() {
		
	}
	
	public Grade(double nums) {
		value = nums; 
	}
	
	public String getLetterGrade(double nums) {
		if (value >= 90) 
		{
			return "A"; 
		}
		if (value >= 80) 
		{
			return "B"; 
		}
		if (value >= 70) 
		{
			return "C"; 
		}
		if (value >= 60) 
		{
			return "D";
		}
		else
		{
			return "F"; 
		}
	}
	
	public double getNumericGrade() {
		return value; 
	}
	
	public String toString() {
		String output = "";
		output += value + "\n" + getLetterGrade(value);
		return output; 
	}
}
