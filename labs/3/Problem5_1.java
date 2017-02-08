import java.util.Scanner;

public class Problem5_1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int positive = 0;
		int negative = 0;
		int total = 0;
		float sum = 0;
		
		
		System.out.print("Enter an integer, the input ends "
		  + "if it is 0: ");
		
		int number;
		
		while((number = input.nextInt()) != 0) {
			total += number;
			sum++;
			if(number > 0) {
				positive++;
			} else if(number < 0) {
				negative++;
			}
			
		}
		
		if (positive + negative == 0) {
			System.out.println("No numbers are entered except 0");
			System.exit(0);
		}
		
		float average = total / (float) sum;
		System.out.println("The number of positives is " + positive);
		System.out.println("The number of negatives is " + negative);
		System.out.println("The total is " + total);
		System.out.println("The average is " + average);
	}
}