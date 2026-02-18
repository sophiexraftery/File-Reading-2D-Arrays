public class Arrays2DExercise10
{
    public static void main(String[] args)
    {
        //Create a 6x8 2D array (6 rows, 8 columns)
        int[][] numbers = new int[6][8];

        int value = 1; //Counter to fill the array

        //Populate the array
        for(int row = 0; row < numbers.length; row++)
        {
            for(int col = 0; col < numbers[row].length; col++)
            {
                numbers[row][col] = value;
                value++;
            }
        }

        //Output the array
        for(int row = 0; row < numbers.length; row++)
        {
            for(int col = 0; col < numbers[row].length; col++)
            {
                System.out.printf("%3d ", numbers[row][col]); //3 spaces for alignment
            }
            System.out.println(); //Move to next row
        }
    }
}
