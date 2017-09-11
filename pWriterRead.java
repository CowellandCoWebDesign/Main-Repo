//pg 241 n14
// William cowell

import java.util.Scanner;
import java.io.*;

public class pWriterRead
{
	public static void main(String[] args) throws IOException
	{
		String fileName;

		//creats a scanner objetc for keyboard input
		Scanner keyboard = new Scanner(System.in);

		//gets the file name to be opened
		System.out.println("Enter a filename(NumberList.txt) to read and display: ");
		fileName = keyboard.nextLine();

		//opens the file
		File file = new File(fileName);
		Scanner inputFile = new Scanner(file);

		//this loop detects the end of the file
		while (inputFile.hasNext())
			{
				//creates a variable that will read the next line of the document
				String docLine = inputFile.nextLine();

				//Displayes the contents of the next line in the document
				System.out.println(docLine);
			}

			//closes the file
			inputFile.close();
	}
}