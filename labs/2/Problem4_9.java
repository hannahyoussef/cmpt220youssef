import java.util.Scanner;

public class Problem4_9 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a character: ");
    
    String a = input.nextLine();
    char ch = a.charAt(0);
    if (a.length() == 1) {
    	System.out.println("The Unicode for the character " + ch + " is " + ((int) ch));
    }
    else
    	System.out.println("complain about the number of characters.");;
	}
}