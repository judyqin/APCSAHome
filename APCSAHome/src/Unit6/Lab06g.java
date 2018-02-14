package Unit6;

import static java.lang.System.*;

public class Lab06g
{
	public static void main ( String[] args )
	{
		LoopStats test = new LoopStats(1, 5);
		test.setNums(1, 5);
		System.out.println(test.toString());
		System.out.println("total " + test.getTotal());
		System.out.println("even count " + test.getEvenCount());
		System.out.println("odd count " + test.getOddCount() + "\n");
		
		
		
		
					
	}
}