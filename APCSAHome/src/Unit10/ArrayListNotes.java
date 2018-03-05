package Unit10;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListNotes {

	public static void main(String[] args)
	{
		int[] numbers = {2,3,4}; //reference variable (cannot print directly)
		int num = 8; //primitive variable (can print) 
		Integer number = new Integer(5); //Integer class has a built in toString
		
		ArrayList<Integer> numList; 
		
		String w = "A";
		String word = new String("A");
		
		System.out.println(numbers);
		if (w == word.toString())
			System.out.println("same");
		else 
			System.out.println("not same");
		
		
		System.out.println(w);
		System.out.println(word);
	
//		System.out.println(num);
//		System.out.println(number);
		
		int[] temp = numbers; 
		//temp[0] = 9; 
		
		System.out.println(temp);
		System.out.println(Arrays.toString(numbers));
		
		numList = new ArrayList(); 
		numList.add(2);
		
		System.out.println(numList.toString());
		System.out.println(numList.get(0));
		
		
		
	}
}
