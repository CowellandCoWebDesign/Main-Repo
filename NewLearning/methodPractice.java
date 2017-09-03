public class methodPractice
{
		public static void main(String[] args)
		{
			System.out.println("this is the main method.");

			secondaryMethod(4);

			System.out.println("now your back in the main method again after calling the secondaryMethod with an argument of 4.");
		}

		public static void secondaryMethod(int num)
		{
			System.out.println("now we are in the secondaryMethod and the value passed is " + num + "!");
		}
}
