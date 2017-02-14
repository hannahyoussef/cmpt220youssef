public class Problem6_16 {

	public static void main(String[] args) {
		// Brief introduction to the user about what the program does
		System.out.println("This program displays the number of days in a year from " + 
		  "the year 2000 to 2020." + "\n" + 
		  "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n");
		
		// Prints the number of days in every year from 2000 to 2020
	    for (int year = 2000; year <= 2020; year++) {
	        System.out.println(year + " has " + numberOfDaysInAYear(year) + " days");
	      }
	    }

		// Displays 366 or 365 days depending on if it is a leap year or not
	    public static int numberOfDaysInAYear(int year) {
	      if (isLeapYear(year)) {
	        return 366;
	      } else {
	        return 365;
	      }
	    }

	    // A leap year occurs every 4 years
	    static boolean isLeapYear(int year) {
	      return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	    }
}