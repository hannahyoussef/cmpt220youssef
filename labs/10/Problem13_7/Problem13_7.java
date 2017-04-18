package Problem13_7;

public class Problem13_7 {
	/** Main method */
	public static void main(String[] args) {
		// Create an array of five GeometricObjects
		GeometricObject[] squares = {new Square(4.5), new Square(14), 
			new Square(8.2), new Square(12), new Square(10)};

		// Display the area and invoke the howToColor 
		// method for each GeometricObject
		for (int i = 0; i < squares.length; i++) {
		 	System.out.println("\nSquare #" + (i + 1));
		 	System.out.println("Area: " + squares[i].getArea());
		 	System.out.println("How to color: " + ((Square)squares[i]).howToColor());
		 } 
	}
}