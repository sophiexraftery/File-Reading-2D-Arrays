import java.io.*;
import java.util.*;

public class Arrays2DExercise16
{
    public static void main(String[] args) throws IOException
    {
        Scanner keyboard = new Scanner(System.in);

        // Create file objects
        File countryFile = new File("countries.txt");
        File capitalFile = new File("capitals.txt");

        // Create scanners for files
        Scanner countryInput = new Scanner(countryFile);
        Scanner capitalInput = new Scanner(capitalFile);

        // Create arrays (196 lines in each file)
        String[] countries = new String[196];
        String[] capitals = new String[196];

        // Read countries into array
        int i = 0;
        while(countryInput.hasNextLine())
        {
            countries[i] = countryInput.nextLine();
            i++;
        }

        // Read capitals into array
        i = 0;
        while(capitalInput.hasNextLine())
        {
            capitals[i] = capitalInput.nextLine();
            i++;
        }

        int choice;

        do
        {
            System.out.println("------------------------------------------------------------");
            System.out.println("-------------Country and Capital City Search----------------");
            System.out.println("------------------------------------------------------------");

            System.out.print("Enter 1 to search by country or 2 to search by city. Enter 0 to end program: ");
            choice = keyboard.nextInt();
            keyboard.nextLine(); // clear buffer

            if(choice == 1)
            {
                System.out.print("Enter country name: ");
                String searchCountry = keyboard.nextLine();

                boolean found = false;

                for(i = 0; i < countries.length; i++)
                {
                    if(searchCountry.equalsIgnoreCase(countries[i]))
                    {
                        System.out.println("The capital of " + countries[i] + " is " + capitals[i]);
                        found = true;
                    }
                }

                if(!found)
                {
                    System.out.println("Country not found.");
                }
            }

            else if(choice == 2)
            {
                System.out.print("Enter city name: ");
                String searchCity = keyboard.nextLine();

                boolean found = false;

                for(i = 0; i < capitals.length; i++)
                {
                    if(searchCity.equalsIgnoreCase(capitals[i]))
                    {
                        System.out.println(capitals[i] + " is the capital of " + countries[i]);
                        found = true;
                    }
                }

                if(!found)
                {
                    System.out.println("City not found.");
                }
            }

        } while(choice != 0);

        System.out.println("Program ended.");

        countryInput.close();
        capitalInput.close();
        keyboard.close();
    }
}
