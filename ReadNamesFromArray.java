import java.util.Scanner;
import java.io.*;

public class ReadNamesFromArray
{
	public static void main(String[] args) throws IOException
	{
	//use the file called myfile.txt
	String filename = "myfile.txt";
	File file = new File(filename);
	Scanner inputFile = new Scanner(file);

	//create an array of Strings called namesList
	String[] namesList = new String[26];

	//populate each index of the array with the data from the file
	for(int i = 0; i < 26; i++)
	{
		namesList[i] = inputFile.nextLine();
	}

	for(int i = 0; i < namesList.length; i++)
	{
		System.out.println(namesList[i]);
    }

	inputFile.close();

	}
}