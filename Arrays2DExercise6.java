public class Arrays2DExercise6
{
	public static void main(String[] args)
	{
		int [][] myArray = new int [2][4];

		myArray[0][0] = 55;
		myArray[0][1] = 56;
		myArray[0][2] = 57;
		myArray[0][3] = 58;
		myArray[1][0] = 59;
		myArray[1][1] = 60;
		myArray[1][2] = 61;
		myArray[1][3] = 62;

		System.out.println("  ___________________ ");
		System.out.println(" | " + myArray[0][0] + " | " + myArray[0][1] + " | " + myArray[0][2] + " | " + myArray[0][3] + " | ");
		System.out.println(" | " + myArray[1][0] + " | " + myArray[1][1] + " | " + myArray[1][2] + " | " + myArray[1][3] + " | ");
		System.out.println("  ___________________ ");

	}
}
