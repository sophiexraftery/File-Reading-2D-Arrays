import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class Arrays2DExercise15
{
    public static void main(String[] args) throws IOException
    {
        Scanner input = new Scanner(System.in);

        //Read file into array (40 values)
        int[] numbers = new int[40];

        File file = new File("numbers.txt");
        Scanner inputFile = new Scanner(file);

        int i = 0;
        while(inputFile.hasNext())
        {
            numbers[i] = inputFile.nextInt();
            i++;
        }
        inputFile.close();

        //Find highest and lowest values
        int highest = numbers[0];
        int lowest = numbers[0];
        int highestIndex = 0;
        int lowestIndex = 0;

        for(int j = 0; j < numbers.length; j++)
        {
            if(numbers[j] > highest)
            {
                highest = numbers[j];
                highestIndex = j;
            }

            if(numbers[j] < lowest)
            {
                lowest = numbers[j];
                lowestIndex = j;
            }
        }

        int difference = highest - lowest;

        System.out.println("Highest value is: " + highest + " and is at index " + highestIndex);
        System.out.println("Lowest value is: " + lowest + " and is at index " + lowestIndex);
        System.out.println("The difference between the highest and the lowest values is : " + difference);

        //Sort the array
        Arrays.sort(numbers);

        //Order or reverse order
        System.out.print("\nOutput array in order(enter o) or in reverse order(enter r)? ");
        char choice = input.next().charAt(0);

        if(choice == 'o')
        {
            for(int j = 0; j < numbers.length; j++)
            {
                System.out.println(numbers[j]);
            }
        }
        else if(choice == 'r')
        {
            for(int j = numbers.length - 1; j >= 0; j--)
            {
                System.out.println(numbers[j]);
            }
        }

        //Output every 5th value
        System.out.println("\nOutputting every 5th value");
        for(int j = 0; j < numbers.length; j += 5)
        {
            System.out.println(numbers[j]);
        }

        //User controlled output
        System.out.println("\n-- Array Output --");

        int startIndex;
        int amount;

        //Validate starting index
        do
        {
            System.out.print("Specify output starting at index: ");
            startIndex = input.nextInt();

            if(startIndex >= numbers.length)
            {
                System.out.println(startIndex + " is too high a number to specify as the array has only 40 elements");
            }

        } while(startIndex >= numbers.length);

        //Validate amount to output
        do
        {
            System.out.print("Specify how many elements should be output: ");
            amount = input.nextInt();

            if(startIndex + amount > numbers.length)
            {
                System.out.println(amount + " elements to output is too large as this would be larger than the array size");
            }

        } while(startIndex + amount > numbers.length);

        for(int j = startIndex; j < startIndex + amount; j++)
        {
            System.out.println("Index: " + j + "; value: " + numbers[j]);
        }

        input.close();
    }
}
