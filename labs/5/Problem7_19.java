import java.util.Scanner;

public class Problem7_19 {

	// start main method
	public static void main(String[] args) {
		
		// create an object for Scanner class
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter list: ");
		
		// prompt the user to enter a list of integers
		int size = input.nextInt();
		
		// create an array of integers
		int[] array = new int[size];
		
		for(int i = 0; i < array.length; i++)
			array [i] = input.nextInt();
		
		// call to isSorted method
		boolean result = isSorted(array);

		
		for(int i = 0; i < array.length; i++)
			System.out.print("");
		if(result) {
			System.out.println("The list is already sorted");
		} else {
			System.out.println("The list is not sorted");
		}
	}
	
	public static boolean isSorted(int [] list) {
		boolean result = true;
		
		for(int i = 0; i < list.length - 1; i++) {
			if(list[i] > list[i + 1]) {
				result = false;
			}
		}
		return result;
	}

}
