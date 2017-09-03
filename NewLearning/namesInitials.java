import java.util.Scanner;

public class namesInitials
{
		public static void main(String[] args)
		{
			String firstName; 
			String middleName; 
			String lastName;


			Scanner keyboard = new Scanner(System.in);

			System.out.println("What is your first name?");
			firstName = keyboard.nextLine();

			System.out.println("What is your middle name?");
			middleName = keyboard.nextLine();

			System.out.println("What is your last name?");
			lastName = keyboard.nextLine();

			char firstInitial = firstName.charAt(0);
			char middleInitial = middleName.charAt(0); 
			char lastInitial = lastName.charAt(0);

			System.out.println("Your first name is " + firstName + ".");
			System.out.println("Your middle name is " + middleName + ".");
			System.out.println("Your last name is " + lastName + ".");
			System.out.println("So, your full name is " + firstName + middleName + lastName + ".");
			System.out.println(" Your initials are " + firstInitial + middleInitial + lastInitial + ".");
		}
}
