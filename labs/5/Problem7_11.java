import java.text.DecimalFormat;
import java.util.Scanner;
public class Problem7_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("###.##");
		double[] numbers = new double[10];
		double deviationresult;
		double meanresult;
		System.out.println("Enter ten numbers: ");
		for(int i = 0; i < 10; i++) {
			// Inputting values
			numbers[i] = input.nextDouble();
		}
		// function to call calculate deviation
		deviationresult = deviation(numbers);
		
		// function call to calculate mean
		meanresult = mean(numbers);
		
		// outputting mean deviation
		System.out.println("The mean is " + dec.format(meanresult));
		System.out.println("The standard deviation is " + dec.format(deviationresult));
		}
	public static double mean(double[] numbers) {
		double sum = 0;
		double average;
		for(int i = 0; i < 10; i++) {
			sum += numbers[i];
		}
		average = sum / 10;
		// returns average
		return average;
	}
	public static double deviation(double[] numbers) {
		double sum = 0;
		double sum1 = 0;
		double average;
		double result;
		for(int i = 0; i < 10; i++) {
			sum += numbers[i];
		}
		average = sum / 10;
		for(int i = 0; i < 10; i++) {
			
			sum1 += Math.pow((numbers[i] - average), 2);
		}
		result = sum1 / 9;
		result = Math.sqrt(result);
		return result;
	}

}
