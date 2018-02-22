package Unit8;

import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		setRoman(str); 

	}

	public RomanNumeral(Integer orig)
	{
		setNumber(orig);
	}

	public void setNumber(Integer num)
	{
		number = num; 
	}

	public void setRoman(String rom)
	{

		roman = rom; 
	}

	public Integer getNumber()
	{
		number = 0; 
		

		
		/*if (roman == "M")
		{
			number = 1000;
		}
		if (roman == "CM")
		{
			number = 900;
		}
		if (roman == "D")
		{
			number = 500;
		}
		if (roman == "CD")
		{
			number = 400;
		}
		if (roman == "C")
		{
			number = 100;
		}
		if (roman == "XC")
		{
			number = 90;
		}
		if (roman == "L")
		{
			number = 50;
		}
		if (roman == "XL")
		{
			number = 40;
		}
		if (roman == "X")
		{
			number = 10;
		}
		if (roman == "IX")
		{
			number = 9;
		}
		if (roman == "V")
		{
			number = 5;
		}
		if (roman == "IV")
		{
			number = 4;
		}
		if (roman == "I")
		{
			number = 1;
		}*/
		return number;
	}

	public String toString()
	{
		return roman + "\n";
	}
}