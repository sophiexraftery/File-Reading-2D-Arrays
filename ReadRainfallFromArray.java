import java.util.Scanner;
import java.io.*;

public class ReadRainfallFromArray
{
	public static void main(String[] args) throws IOException
	{
	//use the file called rainfall.txt
	String filename = "rainfall.txt";
	File file = new File(filename);
	Scanner inputFile = new Scanner(file);

	//create an array of doubles called rainfallDaily
	double[] rainfallDaily = new double[366];

	//populate each index of the array with the data from the file
	for(int i = 1; i < rainfallDaily.length; i++)
	{
		rainfallDaily[i] = inputFile.nextDouble();
	}

	//find the total, average daily, average weekly, average monthly, highest rainfall, lowesst rainfall.
	double total = 0.0;
	double dailyAverage;
	double weeklyAverage;
	double monthlyAverage;
	double highest = rainfallDaily[1];
	int highestDay = 0;
	double lowest = rainfallDaily[1];
	int lowestDay = 0;

	for(int i = 0; i < rainfallDaily.length; i++)
	{
		System.out.println("Rainfall for day " + i +" was " + rainfallDaily[i]);

		total += rainfallDaily[i];

		//Check for highest rainfall
		if(rainfallDaily[i] > highest)
		{
			highest = rainfallDaily[i];
			highestDay = i;
		}

		//Check for lowest rainfall
		if(rainfallDaily[i] < lowest)
		{
			lowest = rainfallDaily[i];
			lowestDay = i;
		}
	}

	//update the daily, weekly, monthly rainfall
	dailyAverage = total / 366;
	weeklyAverage = dailyAverage * 7;
	monthlyAverage = dailyAverage * 31;

	System.out.printf("Total rainfall for the year was: %.2f ", total);
	System.out.printf("%nAverage daily rainfall was: %.2f ", dailyAverage);
	System.out.printf("%nAverage weekly rainfall was: %.2f ", weeklyAverage);
	System.out.printf("%nAverage monthly rainfall was: %.2f ", monthlyAverage);
	System.out.printf("%nThe day with the highest rainfall was day %d , which had %.2f mm of rainfall that day.",highestDay , highest);
	System.out.printf("%nThe day with the lowest rainfall was day %d , which had %.2f mm of rainfall that day.",lowestDay , lowest);
		
	inputFile.close();
	}
}
