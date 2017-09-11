// pg 240 N 13
//william cowell
//

import java.util.Scanner;
import java.io.*;

public class printWriterEx
{
	public static void main (String[] arg) throws IOException
	{
		String fileName;

		//creates a scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);

		//This ask for a filename
		System.out.println("Enter a filename: ");
		fileName = keyboard.nextLine();

		// This creates a file under the name we just asked 
		PrintWriter outputFile = new PrintWriter(fileName);

		//This is going to add to the file numbers 0-100
		for (int i = 0; i <=100; i++)
		{
			outputFile.println(i);
		}

		outputFile.close();
	}
}