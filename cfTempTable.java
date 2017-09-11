//pg 290
//william cowell

import java.util.*;
import java.text.DecimalFormat;

public class cfTempTable
{
	public static void main(String[] args)
	{
		double celsius;
		double fahrenheit;

		fahrenheit = getTemp();

		celsius = convertTemp(fahrenheit);

		displayData(fahrenheit, celsius);

		displayTable();

	}
	/**
	This method gets the temperature from the user.
	@return numTemp "this returns the F temp from the user"
	*/
	public static double getTemp()
	{
		double numTemp;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("This porgram is going to make a table of the temperature conversions.");
		System.out.println("Please enter a temperature in F and i will then make a conversion for you, as well as a table");
		numTemp = keyboard.nextDouble();
		return numTemp;
	}
/**
	This method converts a C temp from an entered F temp
	@param fahrenheit "passed temp from the getTemp method"
	@return numCelsi "a converted F temp to C"
*/
	public static double convertTemp(double fahrenheit)
	{
		double numCelsi = (fahrenheit-32) * 5/9;
		return numCelsi;
	}
/**
	This method provides an exact caluclation from what was requested by the user.
	@param fahrenheit "the original entered F temp from the user"
	@param celsius " the converted temp from F to C"
*/
	public static void displayData(double fahrenheit, double celsius)
	{
		System.out.println("The temperature in fahrenheit that you entered is " + fahrenheit + " F and that is " + celsius + " C.");
	}
/**
	This method displays a table that shows a conversion between from F to C from 0F to 100F
*/
	public static void displayTable()
	{
		DecimalFormat formatter = new DecimalFormat("#0.00");

		System.out.println("\n \n Below is a table that offers a few other caluclations");
		System.out.println("fahrenheit   			celsius");
		System.out.println("-------------------------------");

		for (int i = 0; i <=20; i++)
		{
			//C temp
			double cTemp = convertTemp(i);
			System.out.println(formatter.format(i) + "   				" + formatter.format(cTemp));
		}
	}
}
