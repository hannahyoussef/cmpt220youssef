import java.util.Scanner;

public class Problem7_8 {

	public static void main(String[] args) {
		// Brief introduction to the user about what the program does
		System.out.println("Enter 10 integers and this program will return " + 
		  "the average of the values." + "\n" + 
		  "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n");
		
	    Scanner input = new Scanner(System.in);
	
	    // Prompts the user to enter 10 values
	    double[] list2 = new double[10];
	    System.out.print("Enter 10 double values: ");

	    int i = 0;
	    while (i < list2.length) {
	      list2[i] = input.nextDouble();
	      i++;
	    }

	    // Prints the average value of the 10 numbers input
	    System.out.println(average(list2));
	  }

	// Average of int array 
	public static int average(int[] array) {
	    int sum = 0;
	    for (int i = 0; i < array.length; i++) {
	      sum += array[i];
	    }
	    return sum / array.length;
	  }

	// Average of double array
	 public static double average(double[] array) {
	    double sum = 0;
	    for (int i = 0; i < array.length; i++) {
	      sum += array[i];
	    }
	    return sum / array.length;
	  }
}