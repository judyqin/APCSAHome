package Unit13;

import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

class InsertionSort
{
	private ArrayList<String> list;

	public InsertionSort()
	{
		 list = new ArrayList<String>();
	}

	//modfiers
	public void add( String  word)
	{

		int loc = 0; //OLD CODE 
//		if (list.size() == 0) {
//			list.add(word);
//		}
//		else if (list.get(loc).compareTo(word) < 0){
//			if (list.size() >= 2 && word.compareTo(list.get(loc+1))>0) {
//				list.add(loc+2, word);
//			}
//			else {
//			list.add(loc+1, word);
//			}
//			loc++;
//		}
//		else if (list.get(loc).compareTo(word) > 0) {
//			list.add(loc,word);
//			loc++;
//		}
		//System.out.println(list);
		
		if(Collections.binarySearch(list,word) < 0) {
			loc = Collections.binarySearch(list, word);
			loc = Math.abs(loc)-1;
			list.add(loc,word);
		}
		
		
	}


	public void remove(String word)
	{

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).compareTo(word) == 0) {
				list.remove(i);
			}
		}
		//System.out.println(list);

	}

	public String toString()
	{
		String output = "";
		for (int i = 0; i<list.size(); i++) {
			output += list.get(i) + " ";
		}
		return output;
	}
}
