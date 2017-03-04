// Import the required packages
import java.util.Calendar;
import java.util.GregorianCalendar;

// Class declaration
public class Problem9_5 {

	// Main method
	public static void main(String[] args) {
		
		// Create the Calendar object
		Calendar calendar = new GregorianCalendar();
		
		// Display the current year, month and day
		// Display the year
		System.out.println("Current Year: " + calendar.get(Calendar.YEAR));
		// Display the month (For January, the value is 0)
		System.out.println("Current Month: " + calendar.get(Calendar.MONTH));
		// Display the day of the month
		System.out.println("Current Day: " + calendar.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("\n");
		
		// Set elapsed time since January 1, 1970 to 123456789765L
		calendar.setTimeInMillis(123456789765L);
		
		// Display the year, month and day
		// Display the year
		System.out.println("Year: " + calendar.get(Calendar.YEAR));
		// Display the month (For January, the value is 0)
		System.out.println("Month: " + calendar.get(Calendar.MONTH));
		// Display the day of the month
		System.out.println("Day: " + calendar.get(Calendar.DAY_OF_MONTH));
	}
}