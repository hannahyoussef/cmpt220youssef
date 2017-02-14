public class Problem7_4 {

	public static void main(String[] args) {
		// Brief introduction to the user about what the program does
		System.out.println("Enter up to 100 scores and this program will display:" + "\n" + 
		  "-The average of all the scores" + "\n" + 
		  "-The number of scores above or equal to the average" + "\n" + 
		  "-The number of scores below the average" + "\n\n" + 
		  "Enter a negative number to signify the end of the input and display the results." + "\n" + 
		  "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n");
		
	    double[] scores = new double[100];
	    double sum = 0;
	    int count = 0;

	    double item;

	    java.util.Scanner input = new java.util.Scanner(System.in);
	    do {
	      System.out.print("Enter a score: ");

	      item = input.nextDouble();

	      if (item >= 0) {
	        scores[count] = item;
	        sum += item;
	        count++;
	      }
	    } while (item >= 0);

	    System.out.println("count is " + count);
	    double average = (sum) / count;

	    int numOfAbove = 0;
	    int numOfBelow = 0;
	    for (int i = 0; i < count; i++) {
	      if (scores[i] >= average) {
	        numOfAbove++;
	      } else {
	        numOfBelow++;
	      }
	    }

	    System.out.println("The average is " + average);
	    System.out.println("The number of scores above or equal to the average is "
	        + numOfAbove);
	    System.out.println("The number of scores below the average is " + numOfBelow);
	}
}