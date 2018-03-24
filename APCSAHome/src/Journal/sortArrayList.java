package Journal;

import java.util.Arrays;

public class sortArrayList {
	public static void sortArrayList(Comparable[] list )
	{
		sortArrayList(list, 0, list.length);
	}
	private static void sortArrayList( Comparable[] list, int front, int back)
	{
		
		int mid = (front+back)/2;
		if( mid==front) return;
		sortArrayList(list, front, mid);
		sortArrayList(list, mid, back);
		help(list, front, back);
		System.out.println(Arrays.toString(list));
	}
	
	private static void help(Comparable[] list, int front, int back)
	{
		Comparable[] temp = new Comparable[back-front];
		int i = front, j = (front+back)/2, k =0;
		int mid =j;
		while(i < mid && j < back) {
			if(list[i].compareTo(list[j]) < 0)
				temp[k++]=list[i++];
			else
				temp[k++]=list[j++];
		}
		while(i < mid)
			temp[k++]=list[i++];
		while(j<back)
			temp[k++]=list[j++];
		for(i = 0;i < back-front; ++i)
			list[front+i]=temp[i];
	}	
	
	public static void main (String[] args){
		Comparable[] list = {10,20,45,29,58,40,4};
		sortArrayList(list);
	}
}