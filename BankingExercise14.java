import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BankingExercise14
{
    public static void main(String[] args) throws IOException
    {

        Scanner keyboard = new Scanner(System.in);

        //Open the file
        File file = new File("banking.txt");
        Scanner inputFile = new Scanner(file);

        //Assume max 100 users for array size
        int maxUsers = 100;

        String[] names = new String[maxUsers];
        int[] accountNumber = new int[maxUsers];
        double[] current = new double[maxUsers];

        int i = 0;

        //Read the file
        while(inputFile.hasNext())
        {
            names[i] = inputFile.next();
            accountNumber[i] = inputFile.nextInt();
            current[i] = inputFile.nextDouble();
            i++;
        }

        inputFile.close();

        //Output all users
        for(int j = 0; j < i; j++)
        {
            System.out.println("-------------------------");
            System.out.println("Name: " + names[j]);
            System.out.println("ID: " + accountNumber[j]);
            System.out.printf("Total: %.2f\n", current[j]);
        }
        System.out.println("-------------------------");

        //Prompt user to select a user
        System.out.print("Select user?: ");
        int userIndex = keyboard.nextInt() - 1; //assuming user enters 1-based index

        if(userIndex >= 0 && userIndex < i)
        {
            System.out.println("-------------------------");
            System.out.println("Name: " + names[userIndex]);
            System.out.println("ID: " + accountNumber[userIndex]);
            System.out.printf("Total: %.2f\n", current[userIndex]);
            System.out.println("-------------------------");
        }
    }
}
