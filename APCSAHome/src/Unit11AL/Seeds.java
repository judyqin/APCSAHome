package Unit11AL;
import java.util.Scanner; 

public class Seeds {

		private int seeds; 
		
		public Seeds() {
		}
		
		public Seeds(int s) {
			seeds = s; 
		}
		
		public Integer getSeedNum() {
			return seeds; 
		}
		
		public String toString() {
			String output = "";
			output += seeds; 
			return output + " seeds"; 
		}
		
	}

