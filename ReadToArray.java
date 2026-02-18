import java.util.Scanner;
import java.io.*;

public class ReadToArray
{
	public static void main(String[] args) throws IOException
	{
	//use the file called numbers.txt
	String filename = "numbers.txt";
	File file = new File(filename);
	Scanner inputFile = new Scanner(file);

	//create an array of ints called nums
	int[] nums = new int[5];

	//populate each index of the array with the data from the file
	nums[0] = inputFile.nextInt();
	nums[1] = inputFile.nextInt();
	nums[2] = inputFile.nextInt();
	nums[3] = inputFile.nextInt();
	nums[4] = inputFile.nextInt();

	for(int i = 0; i < nums.length; i++)
	{
		System.out.println(nums[i]);
    }

	inputFile.close();
	}
}