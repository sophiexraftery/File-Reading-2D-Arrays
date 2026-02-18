import java.util.Scanner;
import java.io.*;

public class ReadPeopleExercise13
{
    public static void main(String[] args) throws IOException
    {
        //File name
        String filename = "people.txt";
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        //Assume we know the number of people in the file, e.g., 10
        int size = 10;
        String[] names = new String[size];
        int[] idNum = new int[size];
        double[] total = new double[size];

        int i = 0;

        //Read data from file
        while(inputFile.hasNext())
        {
            names[i] = inputFile.next();
            idNum[i] = inputFile.nextInt();
            total[i] = inputFile.nextDouble();
            i++;
        }

        inputFile.close();

        //Output data
        for(int j = 0; j < i; j++)
        {
            System.out.println("----------------------");
            System.out.println("Name : " + names[j]);
            System.out.println("ID : " + idNum[j]);
            System.out.printf("Total : %.2f\n", total[j]);
        }
    }
}
