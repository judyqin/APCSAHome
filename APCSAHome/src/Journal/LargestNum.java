package Journal;
import java.util.Arrays;
import java.util.Scanner; 

public class LargestNum {

	private int[] l; 
	private int place; 
 	
	public LargestNum() {
		
	}
	
	public void findL(int[] list, int larg, int p) {
		l = list; 
		int largest = larg; 
		place = p; 
		
		if (p == l.length) {
			System.out.println(largest);
		}
		else { 
			if (l[place] > largest) {
				largest = l[place];
			}
			place++; 
			findL(l, largest, place);
		}

	}
	
	public static void main(String args[]) {
		
		Scanner keyboard = new Scanner(System.in); 
		int num; 
		int[] nums = new int[8];
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Enter a number: ");
			num = keyboard.nextInt(); 
			nums[i] = num; 
		}
		System.out.println(Arrays.toString(nums));
		
		LargestNum test = new LargestNum();
		test.findL(nums, 0, 0);
		
	}
	
}
