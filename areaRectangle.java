// p 289  n 3
//william cowell

import java.util.*;

public class areaRectangle
{
	public static void main(String[] args)
	{
	double length;
	double area;
	double width;

	length = getLength();

	width = getWidth();

	area = getArea(length, width);

	displayData(length, width, area);
	}

	public static double getLength()
	{
		double numLength;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("This program is going to calculate the Area of a rectangle for you.");
		System.out.println("Please enter the lenght of the rectangle: ");
		numLength = keyboard.nextDouble();

		return numLength;
	}

	public static double getWidth()
	{
		double numWidth;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter the width: ");
		numWidth = keyboard.nextDouble();

		return numWidth;
	}

	public static double getArea(double length, double width)
	{
		double numArea = length * width;
		return numArea;
	}

	public static void displayData(double length, double width, double area)
	{
		System.out.println("The lenght that you have entered is: " + length);
		System.out.println("The width that you have entered is: " + width);
		System.out.println("calculating...");
		System.out.println("The area is : " + area);
		System.out.println("Thank you for using Wiscco Products! Please donate at www.donatewiscco.com");
	}

}