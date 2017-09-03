//WILLIAM SCOTT COWELL
//
//
//
//

//imports all util files.
import java.util.*;

public class superSalesTax
{
		// main method
		public static void main (String[] args)
		{
			double salesAmount;   			 //sales amount
			double salesTaxAmount;			// sales tax amount
			double totalAmountWithTax;		//total amount
			String requestedState; 			//requested state
			double stateTaxPercentageInPercentageForm;		//state tax with changed amount display


			Scanner keyboard = new Scanner(System.in);		// adds a scanner object

			HashMap<String, Double> stateTaxPercentage = new HashMap<String, Double>();		// adds a HashMap for the states, tax rates

			stateTaxPercentage.put("California", 0.095);			//CA tax rate added to the hashmap
			stateTaxPercentage.put("Florida", 0.065);			//FL tax rate added to the hashmap
			stateTaxPercentage.put("Arizona", 0.0);				//AZ tax rate added to the hashmap
			stateTaxPercentage.put("Alabama", 0.045);			//AL tax rate added to the hashmap

			System.out.println("What State are you currently selling produce?");		//asks the user for the state
			requestedState = keyboard.nextLine();						//stores the user response

			System.out.println("What is the sales amount?");				//asks the user for the sales amount
			salesAmount = keyboard.nextDouble();						//stores the sales amount

			salesTaxAmount = (salesAmount * (stateTaxPercentage.get(requestedState) ) );	//calculates the sales tax amount
			totalAmountWithTax = (salesAmount + salesTaxAmount);				//calculates the total amount including tax


			System.out.println("The State that you have entered is " + requestedState + ". ");   // prints some data

			stateTaxPercentageInPercentageForm = (stateTaxPercentage.get(requestedState) * 100);	//changes the format of the tax rate to be displayed
			System.out.println(requestedState + " has a " + stateTaxPercentageInPercentageForm + "% tax rate.");	//prints data
			System.out.println("Sales amount is $" + salesAmount);							//prints data
			System.out.println("The added amount of tax is $" + salesTaxAmount);					//prints data
			System.out.println("The total amount due is: $" + totalAmountWithTax);
			System.out.println();									//skips a line
 			System.out.println(" Thank you for your support of the WSC product line. Please come again!");		//thanks user

/*			//this was going to be another was to complete this program, but i went with a HashMap instead.
			if(requestedState == "California")
			{
				System.out.println("The tax percentage for the state that you have entered is " + stateTaxPercentage.get("California") + "%.");

			}
*/			



		}
}