package Journal;

import java.util.ArrayList;

public class sortArrayList {

	public static void main(String args[]) {
		
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		list.add(23);
		list.add(1);
		list.add(100);
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int secondnum = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max) {
				max = list.get(i);
			}
			if (list.get(i) < min) {
				min = list.get(i);
			}
			if (list.get(i) != max && list.get(i) != min) {
				secondnum = list.get(i);
			}
		}
		
		System.out.print(min + " ");
		System.out.print(secondnum + " ");
		System.out.print(max);
	}
	
}
