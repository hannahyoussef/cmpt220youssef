import java.util.Scanner;

public class Problem8_1 {

	// start main method
	public static void main(String[] args) {
		
		// create an object for Scanner class
		Scanner input = new Scanner(System.in);
		
		// create a two dimensional matrix of type double
		double matrix[][] = new double[3][4];
		
		// prompt the user to enter matrix elements
		System.out.println("Enter a " + matrix.length + 
		  "-by-" + matrix[0].length + " matrix row by row:");
		for(int row = 0; row < matrix.length; row++) {
			for(int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = input.nextDouble();
			}
		}
		
		System.out.println();
		for(int column = 0; column < matrix[0].length; column++) {
			
			// call to sumColumn method
			double sum = sumColumn (matrix, column);
			System.out.println("Sum of the elements at column " +
			  column + " is " + sum);
		}
	} // end of main method

	private static double sumColumn(double[][] matrix, int columnIndex) {
		double sum = 0;
		for(int row = 0; row < matrix.length; row++) {
			sum += matrix[row][columnIndex];
		}
		return sum;
	}
}
