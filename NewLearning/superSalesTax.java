import java.util.*;

public class superSalesTax
{
		public static void main (String[] args)
		{
			double salesAmount;
			double salesTaxAmount;
			double totalAmountWithTax;
			String requestedState; 
			double stateTaxPercentageInPercentageForm;


			Scanner keyboard = new Scanner(System.in);

			HashMap<String, Double> stateTaxPercentage = new HashMap<String, Double>();

			stateTaxPercentage.put("California", 0.095);
			stateTaxPercentage.put("Florida", 0.065);
			stateTaxPercentage.put("Arizona", 0.0);
			stateTaxPercentage.put("Alabama", 0.045);

			System.out.println("What State are you currently selling produce?");
			requestedState = keyboard.nextLine();

			System.out.println("What is the sales amount?");
			salesAmount = keyboard.nextDouble();

			salesTaxAmount = (salesAmount * (stateTaxPercentage.get(requestedState) ) );
			totalAmountWithTax = (salesAmount + salesTaxAmount);


			System.out.println("The State that you have entered is " + requestedState + ". ");

			stateTaxPercentageInPercentageForm = (stateTaxPercentage.get(requestedState) * 100);
			System.out.println(requestedState + "has a " + stateTaxPercentageInPercentageForm + "% tax rate.");
			System.out.println("Sales amount is $" + salesAmount);
			System.out.println("The added amount of tax is $" + salesTaxAmount);
			System.out.println("The total amount due is: $" + totalAmountWithTax);
			System.out.println();
			System.out.println(" Thank you for your support of the WSC product line. Please come again!");

			//System.out.println("The tax percentage for the state that you entered is" + )

/*
			if(requestedState == "California")
			{
				System.out.println("The tax percentage for the state that you have entered is " + stateTaxPercentage.get("California") + "%.");

			}
*/			



		}
}
