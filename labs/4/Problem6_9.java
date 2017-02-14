public class Problem6_9 {

	public static void main(String[] args) {
		// Brief introduction to the user about what the program does
		System.out.println("This program displays a table with the conversion of feet" + 
		"to meters and meters to feet." + "\n" + 
		"It displays: " + "\n" + 
		"-1 to 10 feet with an increment of 1 and its conversion to meters" + "\n" + 
		"-20 to 65 meters with an increment of 5 and its conversion to feet" + "\n" + 
		"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n");
		

		// Print the titles of each column - "Feet Meters Meters Feet"
		System.out.println("Feet\t\tMeters\t|\tMeters\t\tFeet");
	    System.out.println(""
	      + "______________________________________________________");
	       for (double i = 1, j = 20; i <= 10 && j <= 65; i++, j = j + 5) {
	           double ftToMr = footToMeter(i);
	           double mrToFt = meterToFoot(j);
	           
	    // Print the conversions on the table
	    System.out.println(i + "\t\t" + ftToMr + "\t|\t" + j + "\t\t" + mrToFt);
	       }
	}

	 	// Conversions for feet to meters
		public static double footToMeter(double foot) {
	       double convMeter = 0;
	       convMeter = 0.305 * foot;
	       return convMeter;
	    }

	 	// Conversions for meters to feet
		public static double meterToFoot(double meter) {
	       double convFoot = 0;
	       convFoot = 3.279 * meter;
	       return convFoot;
	    }
}