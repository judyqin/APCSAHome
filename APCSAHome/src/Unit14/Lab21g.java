package Unit14;

import static java.lang.System.*;

public class Lab21g
{
	public static void main(String args[])
	{
		//instantiate an AtCounter
		//test the code
		
		AtCounter test = new AtCounter(0,0); 
		test.countAts(0, 0);
		System.out.println(test.toString());
		
		AtCounter test2 = new AtCounter(2,5); 
		test2.countAts(2, 5);
		System.out.println(test2.toString());
		
		AtCounter test3 = new AtCounter(5,0); 
		test3.countAts(5, 0);
		System.out.println(test3.toString());
		
		AtCounter test4 = new AtCounter(9,9); 
		test4.countAts(9, 9);
		System.out.println(test4.toString());
		
		AtCounter test5 = new AtCounter(3,9); 
		test5.countAts(3, 9);
		System.out.println(test5.toString());
		
	}
}