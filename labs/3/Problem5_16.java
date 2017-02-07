import java.util.Scanner;

public class Problem5_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int number = input.nextInt();
		
		System.out.print("The factors for " + number + " are: ");
		int factor = 2;
		while (factor <= number)
			if (number % factor == 0) {
				number /= factor;
				System.out.print(factor + " ");
			} else {
					factor++;
				}
				
			}

	}


