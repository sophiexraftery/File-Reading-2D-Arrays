import java.util.Scanner;

public class PuzzleExercise12
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        //Create 3x3 array with given values
        int[][] puzzle = 
        {
            {5, 9, 18},
            {6, 22, 4},
            {6, 4, 7}
        };

        //Output the array
        System.out.println("Puzzle array:");
        for(int row = 0; row < puzzle.length; row++)
        {
            for(int col = 0; col < puzzle[row].length; col++)
            {
                System.out.print(puzzle[row][col] + "\t");
            }
            System.out.println();
        }

        //Ask user which column to sum
        System.out.print("\nAdd all the values of what column? (Enter 0, 1 or 2): ");
        int column = keyboard.nextInt();

        //Sum the values in that column
        int sum = 0;
        for(int row = 0; row < puzzle.length; row++)
        {
            sum += puzzle[row][column];
        }

        System.out.println("The addition of all the values in column " + column + " is: " + sum);

    }
}
