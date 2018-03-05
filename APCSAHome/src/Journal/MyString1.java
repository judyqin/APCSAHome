package Journal;

import java.util.Scanner; 

public class MyString1 {
	
	char[] chars; 
	
	public MyString1(char[] chars)
	{
		String s = "";
		this.chars = chars; 
		for (int i=0; i<chars.length; i++)
		{
			s += chars[i];
		}
		System.out.println(s);
	}
	
	public char charAt(int index)
	{
		return chars[index];
	}
	
	public int length()
	{
		int count = 0; 
		for (char c : chars)
		{
			count++; 
		}
		return count; 
	}
	
	public MyString1 substring(int begin, int end)
	{
		char[] temp = new char[end - begin];
		
		for (int i = begin; i < end; i++)
				{
					temp[i - begin] += chars[i];
				}
		MyString1 test = new MyString1(temp);
		return test; 
	}
	
//	public MyString1 toLowerCase()
//	{
//		char[] temp = new char[chars.length];
//		
//		for(int i = 0; i< temp.length; i++)
//		{
//			if(chars[i] >= 65)
//		}
//	}
//	
//	public boolean equals(MyString s){
//
//	    int test = 0;
//	    for(int i =0; i<s.length();i++){
//	      if (chars[i] == s.getChars()[i])
//	      {
//	        return true;
//	      }
//	      else
//	      {
//	        return false;
//	      }
//	    }
//	    return false;
//	  }
//	  public char[] getChars()
//	  {
//	    return chars;
//	  }
//	
//	/*public static MyString1 valueOf(int i)
//	{
//		
//	}
	
	
	public static void main (String[] args)
	{
	
		char[] chars = {'h', 'a', 'p', 'p', 'y'};
		MyString1 test = new MyString1(chars);
		System.out.println(test.charAt(2));
		System.out.println(test.length());
		System.out.println(test.substring(2, 4));
		
	}
}