package Unit2;

public class Fahrenheit
{
	private double fahrenheit;
	private String rounded; 

	public void setFahrenheit(double fahren)
	{
		fahrenheit = fahren;
	}

	public double getCelsius()
	{
		double celsius = 0.0;
		//add code to convert fahrenheit to celsius
		celsius += (fahrenheit - 32) * (5.0/9.0);
		return celsius;
	}

	public void print()
	{
		//this is part of the solution
		rounded = String.format("%.2f" , getCelsius());
		System.out.println(fahrenheit + " degrees Farenheit == " + rounded + " degrees Celsius");
	}
}