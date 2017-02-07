import java.util.Scanner;

public class Problem6_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		boolean ispalindrome;
		
		System.out.print("Enter an integer number: ");
		num = input.nextInt();
		
		ispalindrome = isPalindrome(num);
		
		if(ispalindrome) {
			System.out.println(num + " is a palindrome number");
		} else {
			System.out.println(num + " is not a palindrome number");
		}
	}
		private static boolean isPalindrome(int n) {
			int rev = reverse(n);
			
			if(rev == n) {
				return true;
			} else {
				return false;
			}
		}
			public static int reverse(int n) {
				int rev = 0;
				int rem;
				
				while(n > 0)
				{
					rem = n % 10;
					rev = rev * 10 + rem;
					n = n / 10;
				}
				return rev;
	}
}