package Journal;

import java.util.Scanner; 

public class MyString1 {
	
	char[] chars; 
	
	public MyString1(char[] chars)
	{
		this.chars = chars; 
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
	
	public MyString1 substring(int begin, int end){
		char[] temp = new char[end-begin];
		
		for(int i = begin; i< end; i++){
			temp[i-begin] = chars[i];
		}
		
		MyString1 newString = new MyString1(temp);
		
		return newString;
		
	}//end Substring
	
	public MyString1 toLowerCase(){
		char[] temp = new char[chars.length];
		
		for(int i = 0; i< temp.length; i++){
			
			if( chars[i]>=65 && chars[i]<=90 ){
				temp[i] = (char) (32+chars[i]);
			}
			else
				temp[i] = chars[i];
			
		}
		
		MyString1 newString = new MyString1(temp);
		
		return newString;
		
	}//endtoLowerCase
	
public boolean equal(MyString1 s){
		
		int test = 0;
		for(int i = 0; i< s.getCharacters().length; i++){
			
			if( this.getCharacters()[i]==s.getCharacters()[i] ){
				test++;
			}			
		}
		
		if(test==s.getCharacters().length)
			return true;
			
		return false;		
	}
	
public char[] getCharacters(){
	return chars;
	
}//end getCharacters

public MyString1 valueOf(int num){
	
	int len = 0;
	while(num>0){
		len++;
		num = num/10;
	}
	
	char[] temp = new char[len];
	
	for(int i = temp.length-1; i> 0; i--){
			temp[i] = (char) (num%10+48);
			num = num/10;
	}
		
	
	MyString1 newString = new MyString1(temp);
	
	return newString;
	
}//end valueOf

public String toString(){
	String output = "";
	for(char c:chars){
		output += c;
	}
	return output;
}

	
	
	public static void main (String[] args)
	{
	
		char[] chars = {'h', 'a', 'p', 'p', 'y'};
		MyString1 test = new MyString1(chars);
		System.out.println(test.charAt(2));
		System.out.println(test.length());
		System.out.println(test.substring(1, 2));
		System.out.println(test.toLowerCase());
		System.out.println(test.equals("hi"));
		System.out.println(test.valueOf(4));
		
	}
}