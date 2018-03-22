package Journal;

public class EvenOne {

	private char[][] nums; 
	private int evenC, evenR; 
	
	public EvenOne() {
	nums = new char[][]{{'0','1','1','1','0','1','0'},
			{'0','1','0','1','1','0','1'},
			{'1','1','1','1','1','1','0'},
			{'0','0','1','0','1','1','1'},
			{'0','1','1','0','0','0','1'},
			{'0','0','1','0','1','0','1'},
			{'1','1','0','0','0','1','0'}};
	}
	
	public void findEven() {
		
		for (int r = 0; r < nums.length; r++) {
			evenR = 0; 
			for (int c = 0; c < nums[r].length; c++) {
				if (nums[r][c] == '1') {
					evenR++; 
				}
			}
			if (evenR % 2 == 0) {
				System.out.println("Row " + r + " even number of ones"); 
			}
			else {
				System.out.println("Row " + r + " odd number of ones"); 
			}
		}

		for (int r = 0; r < nums.length; r++) {
			evenC = 0; 
			for (int c = 0; c < nums[r].length; c++) {
				if (nums[c][r] == '1') {
					evenC++; 
				}
			}
			if (evenC % 2 == 0) {
				System.out.println("Column " + r + " even number of ones"); 
			}
			else {
				System.out.println("Column " + r + " odd number of ones"); 
			}
		}

	}
	
	public String toString() {
		String output = "";
		
		for (char[] row : nums) {
			for (char num : row) {
				output += num + " ";
			}
			output += "\n";
		}
		return output; 
	}
	
	public static void main(String args[]) {
		EvenOne test = new EvenOne();
		System.out.println(test);
		test.findEven();

	}
}
