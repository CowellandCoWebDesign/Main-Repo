//pg 274 cupts to ounces
//william cowell

import java.util.*;

public class cupsToOuncesEx
{
	public static void main(String[] args)
	{
		double cups;
		double ounces;

		cups = getCups();

		ounces = cupsToOunces(cups);

		displayResults(cups, ounces);
	}

	public static double getCups()
	{
		double numCups;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("This program is going to convert cups to fluid ounces.");
		System.out.println("Please enter the number of cups that you would like to convert to ounces: ");
		numCups = keyboard.nextDouble();

		return numCups;
	}

	public static double cupsToOunces(double cups)
	{
		double numOunces;

		numOunces = cups * 8.0;

		return numOunces;
	}

	public static void displayResults(double cups, double ounces)
	{
		System.out.println(cups + " cups are the same as " + ounces + " fluid ounces.");
	}

}