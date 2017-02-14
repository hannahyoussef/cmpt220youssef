public class Problem7_2 {

	public static void main(String[] args) {
		// Brief introduction to the user about what the program does
		System.out.println("Enter 10 integers and this program will return " + 
		  "them in the reverse order in which they were read in." + "\n" + 
		  "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n");
		
	    java.util.Scanner input = new java.util.Scanner(System.in);
	    int[] num = new int[10];

	    // Read the numbers
	    for (int i = 0; i < 10; i++) {
	      System.out.print("Enter a number: ");
	      num[i] = input.nextInt();
	    }

	    // Display the numbers in reverse order
	    for (int i = 9; i >= 0; i--) {
	      System.out.println(num[i]);
	    }
	}
}