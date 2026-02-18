public class Arrays2DExercise9
{
    public static void main(String[] args)
    {
        //Create a 5x6 2D array
        int[][] thursday = new int[5][6];

        //Populate the array with 50
        for(int row = 0; row < thursday.length; row++)
        {
            for(int col = 0; col < thursday[row].length; col++)
            {
                thursday[row][col] = 50;
            }
        }

        //Output the array
        for(int row = 0; row < thursday.length; row++)
        {
            for(int col = 0; col < thursday[row].length; col++)
            {
                System.out.print(thursday[row][col] + " ");
            }
            System.out.println(); //Move to next row
        }
    }
}
