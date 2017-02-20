import java.util.Scanner;

public class Problem8_5 {

	public static void main(String[] args) {
		
		// create a scanner
		Scanner input = new Scanner(System.in);
		double [][] arr1 = new double[3][3];
		double [][] arr2 = new double[3][3];
		double [][] result = new double[3][3];
		String num;
		
		// fetching data of first array
		System.out.print("Enter matrix1: ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				num = input.next();
				arr1[i][j] = Double.parseDouble(num);
			}
		}

		// getting data into second array
		System.out.print("Enter matrix2: ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				num = input.next();
				arr2[i][j] = Double.parseDouble(num);
			}
		}
		
		// calling add matrix method with two matrix as parameter
		result = addMatrix(arr1, arr2);
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				
				System.out.print(result[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

	public static double[][] addMatrix(double[][] a, double[][] b) {
		double [][] c = new double[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				
				// adding two elements of the same index and store it to result array
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}
}