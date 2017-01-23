import java.util.Scanner;
	public class Problem2_5 {
		public static void main(String []args) {
			
		double subtotal, total, rate, gratuity;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the subtotal and a gratuity rate: ");
			subtotal = input.nextDouble();
			rate = input.nextDouble();
			
			gratuity = rate / 100. * subtotal;
			total = subtotal + gratuity;

			System.out.println("The gratuity is $" + gratuity
				+ " and total is $" + total);
		}
}