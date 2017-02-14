public class Problem6_12 {

	public static void main(String[] args) {
		// Brief introduction to the user about what the program does
		System.out.println("This program prints all characters from '1' to 'Z' with " + 
		  "10 characters per line. " + "\n" + 
		  "Each character is separated by one space." + "\n" + 
		  "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n");
		
	    // Prints all characters from 1 to Z, with 10 characters per line
		printChars('1', 'Z', 10);
	 }

	// Directions to print characters with 10 characters per line
	public static void printChars(char ch1, char ch2, int numberPerLine) {
	      int count = 1;
	      for (int i = ch1; i <= ch2; i++, count++)
	        if (count % numberPerLine == 0)
	          System.out.println((char)i);
	        else
	          System.out.print((char)i + " ");
	  }
}