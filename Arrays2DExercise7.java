public class Arrays2DExercise7
{
    public static void main(String[] args)
    {
        int[][] myData = new int[3][6];

        int value = 10;

        //Populate the 2D array
        for(int row = 0; row < myData.length; row++)
        {
            for(int col = 0; col < myData[row].length; col++)
            {
                myData[row][col] = value;
                value++;
            }
        }

        //PRINT BEFORE UPDATING
        System.out.println("ARRAY BEFORE UPDATING: ");

        for(int row = 0; row < myData.length; row++)
        {
            for(int col = 0; col < myData[row].length; col++)
            {
                System.out.print(myData[row][col] + " ");
            }
            System.out.println();
        }

        //Update required positions
        myData[0][2] = 99;
        myData[1][3] = 50;
        myData[2][0] = 77;

        //PRINT AFTER UPDATING
        System.out.println("\nARRAY AFTER UPDATING: ");

        for(int row = 0; row < myData.length; row++)
        {
            for(int col = 0; col < myData[row].length; col++)
            {
                System.out.print(myData[row][col] + " ");
            }
            System.out.println();
        }
    }
}