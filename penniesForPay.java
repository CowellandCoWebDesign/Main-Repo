//pg 242 n 4
//william cowell

import java.util.*;
import java.text.DecimalFormat;

public class penniesForPay
{
	public static void main(String[] args)
	{
		double penniesPerDay = 0.01;
		double sum = 0.01;
		double sumInDollars;
		double penniesInDollars;
		int numDays;

		Scanner keyboard = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("#,##0.00");

		System.out.println("If you made only 1 penny the first day, and that doubled the second day, and so on...");
		System.out.println("This program will determine your salary for a specified amoutn of time, cumulative.");

		System.out.println("Please enter the number of days that you would like to calculate: ");
		numDays = keyboard.nextInt();

		System.out.println("Salary for each day 			Total so far");
		System.out.println("--------------------------------------------");

		for (int i = 0; i <= numDays; i++)
		{
		
			System.out.println("$" + formatter.format(penniesPerDay) + "					" + "$" + formatter.format(sum));	
			penniesPerDay *= 2;
			sum += penniesPerDay;
		}
	}
}