package Unit6;

import static java.lang.System.*;
import java.lang.Math;

public class Lab06i
{
	public static void main ( String[] args )
	{
		Prime test = new Prime();
		test.setPrime(24); 
		System.out.println(test.toString());
		
		Prime test2 = new Prime();
		test2.setPrime(7);
		System.out.println(test2.toString());
		
		Prime test3 = new Prime();
		test3.setPrime(100);
		System.out.println(test3.toString());
		
		Prime test4 = new Prime();
		test4.setPrime(113);
		System.out.println(test4.toString());
		
		Prime test5 = new Prime();
		test5.setPrime(65535);
		System.out.println(test5.toString());
		
		Prime test6 = new Prime();
		test6.setPrime(2);
		System.out.println(test6.toString());
		
		Prime test7 = new Prime();
		test7.setPrime(7334);
		System.out.println(test7.toString());
		
		Prime test8 = new Prime();
		test8.setPrime(7919);
		System.out.println(test8.toString());
		
		Prime test9 = new Prime();
		test9.setPrime(1115125003);
		System.out.println(test9.toString());
		
	}	
}