import java.util.Scanner;

public class EmployeesExercise11
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        //Create a 3x3 array: 3 employees, 3 pieces of info each
        String[][] employees = new String[3][3];

        //Person 1
        System.out.print("Enter first name for person 1: ");
        employees[0][0] = keyboard.nextLine();
        System.out.print("Enter surname for person 1: ");
        employees[0][1] = keyboard.nextLine();
        System.out.print("Enter phone number of person 1: ");
        employees[0][2] = keyboard.nextLine();

        //Person 2
        System.out.print("Enter first name for person 2: ");
        employees[1][0] = keyboard.nextLine();
        System.out.print("Enter surname for person 2: ");
        employees[1][1] = keyboard.nextLine();
        System.out.print("Enter phone number of person 2: ");
        employees[1][2] = keyboard.nextLine();

        //Person 3
        System.out.print("Enter first name for person 3: ");
        employees[2][0] = keyboard.nextLine();
        System.out.print("Enter surname for person 3: ");
        employees[2][1] = keyboard.nextLine();
        System.out.print("Enter phone number of person 3: ");
        employees[2][2] = keyboard.nextLine();

        System.out.println();

        //Output full names
        for(int i = 0; i < employees.length; i++)
        {
            System.out.println("Person " + (i+1) + ": " + employees[i][0] + " " + employees[i][1] + " - Phone number is: " + employees[i][2]);
    	}
	}
}
