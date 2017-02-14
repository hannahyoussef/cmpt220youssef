import java.util.Scanner;

public class Problem6_18 {

	public static void main(String[] args) {
		// Brief introduction to the user about what the program does
		System.out.println("Enter a password and the program will return whether " + 
		  "it is valid or not." + "\n" + 
		  "The password must:" + "\n" + 
		  "-Contain at least eight characters" + "\n" + 
		  "-Consist of only letters and digits" + "\n" + 
		  "-Contain at least two digits" + "\n" + 
		  "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n");
		
	    Scanner input = new Scanner(System.in);
	    
	    // Prompt the user to enter a string
	    System.out.print("Enter a string for password: ");
	    String s = input.nextLine();

	    // Prints the result to the user if a password is valid or not
	    if (isValidPassword(s)) {
	      System.out.println("Valid password");
	    }
	    else {
	      System.out.println("Invalid password");
	    }
	  }

	
	// Check if a string input is a valid password
	public static boolean isValidPassword(String s) {
	  for (int i = 0; i < s.length(); i++) {
	    if (!Character.isLetter(s.charAt(i)) && 
	      !Character.isDigit(s.charAt(i)))
	    return false;
	}
	  
	    // Check length
		if (s.length() < 8)
		  return false;
		
	    // Count the number of digits
	    int count = 0;
	    for (int i = 0; i < s.length(); i++) {
	      if (Character.isDigit(s.charAt(i)))
	        count++;
	    }
	    
	    if (count >= 2)
	      return true;
	    else 
	      return false;
	}
}