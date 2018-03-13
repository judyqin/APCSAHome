package Journal;

public class MyInteger {
	
	private int value; 
	
	public MyInteger(int a)
	{
		setValue(a);
	}
	
	public int get()
	{
		return value; 
	}
	
	public void setValue(int a)
	{
		value = a; 
	}
	
	public boolean isEven()
	{
		if (value%2 == 0)
		{
			return true;
		}
		else
		{
			return false; 
		}
	}
	
	public boolean isOdd()
	{
		if (value%2 != 0)
		{
			return true;
		}
		else
		{
			return false; 
		}
	}
	
	public boolean isPrime()
	{
		for (int run = 2; run < Math.sqrt(value); run++)
		{
			if (value % run == 0)
			{
				return false; 
			}
		}

		return true;
	}
	
	public static boolean isEven(int a)
	{
		if (a%2 == 0)
		{
			return true;
		}
		else
		{
			return false; 
		}
	}
	
	public static boolean isOdd(int a)
	{
		if (a%2 != 0)
		{
			return true;
		}
		else
		{
			return false; 
		}
	}
	
	public static boolean isPrime(int a)
	{
		for (int run = 2; run < Math.sqrt(a); run++)
		{
			if (a % run == 0)
			{
				return false; 
			}
		}

		return true;
	}
	
	public static boolean isEven(MyInteger a)
	{
		if (a.get() %2 == 0)
		{
			return true;
		}
		else
		{
			return false; 
		}
	}
	
	public static boolean isOdd(MyInteger a)
	{
		if (a.get() %2 != 0)
		{
			return true;
		}
		else
		{
			return false; 
		}
	}
	
	public static boolean isPrime(MyInteger a)
	{
		for (int run = 2; run < Math.sqrt(a.get()); run++)
		{
			if (a.get() % run == 0)
			{
				return false; 
			}
		}

		return true;
	}
	
	public boolean equals(int a)
	{
		if (value == a)
		{
			return true;
		}
		else
		{
			return false; 
		}
	}
	
	public boolean equals(MyInteger a)
	{
		if (value == a.get())
		{
			return true; 
		}
		else 
		{
			return false; 
		}
	}
	
	public static int parseInt(char[] c)
	{
		int number = 0; 
		int exp = 0; 
		for (int i = c.length-1; i >= 0; i--)
		{
			number += Math.pow(10,  exp) * (c[i]-48);
			exp++;
		}
		return number; 
	}
	
	public static int parseInt(String s)
	{
		char[] nums = s.toCharArray(); 
		return parseInt(nums); 
	}
	
	public static void main(String[] args) 
	{
		char[] c = {'1', '2', '3', '0'};
		String s = "123";
		
		MyInteger test = new MyInteger(2);
		System.out.println(test.isEven());
		System.out.println(test.isOdd());
		System.out.println(test.isPrime());
		System.out.println(isEven(3));
		System.out.println(isOdd(4));
		System.out.println(isPrime(7));
		System.out.println(isEven(test));
		System.out.println(isOdd(test));
		System.out.println(isPrime(test));
		System.out.println(parseInt(c));
		System.out.println(parseInt(s));
		
	}
	
}