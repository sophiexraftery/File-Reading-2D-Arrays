import java.util.Scanner;
import java.io.*;

public class ReadCoffeeCashFromArray
{
	public static void main(String[] args) throws IOException
	{
	//use the file called weekly.txt
	String filename = "weekly.txt";
	File file = new File(filename);
	Scanner inputFile = new Scanner(file);

	//create an array of doubles called cashWeekly
	double[] cashWeekly = new double[7];

	//populate each index of the array with the data from the file
	for(int i = 0; i < 7; i++)
	{
		cashWeekly[i] = inputFile.nextDouble();
	}

	double sum = 0.0;

	for(int i = 0; i < cashWeekly.length; i++)
	{
		System.out.println("Take for day " + i +" was " + cashWeekly[i]);
		sum += cashWeekly[i];
    }

	System.out.println("Total take for the week was " + sum);

	inputFile.close();

	}
}