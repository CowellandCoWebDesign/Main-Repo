//pg 105  programming challenge  # 1--- 08-29-2017

import java.util.Scanner;

public class nameAge
{
	public static void main(String[] args)
	{
		String name;
		int age;
		double annualPay;
	
		
		Scanner keyboard = new Scanner(System.in);

		System.out.println("What is your name?");
		name = keyboard.nextLine();
	
		System.out.println("What is your age?");
		age = keyboard.nextInt();
	
		System.out.println("What is the income that you hope to achieve in dollars?");
		annualPay = keyboard.nextDouble();

		System.out.println("My name is " + name +  " , I am " + age + " years old. I would like it very much to be able to make $" + annualPay + " per year.");
	}
}

//end of program! 
