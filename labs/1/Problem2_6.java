import java.util.Scanner;

public class Problem2_6 {
	public static void main(String[] args) {
		int number,sum = 0, value = 1, digit;
		Scanner input = new Scanner(System.in);
		do{
			System.out.print("Enter a number between 0 and 1000: ");
			number = input.nextInt();
		}while( number > 1000||number < 0);

		while(number > 0)
		{
			digit = number % 10;
			sum += digit;
			number /= 10;
		}
		System.out.println("The sum of the digits is " + sum);

	}
}