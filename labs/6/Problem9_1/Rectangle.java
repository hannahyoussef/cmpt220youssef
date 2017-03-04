public class Rectangle {

	// two data fields with their default values
	double width = 1.0; // width of rectangle
	double height = 1.0; // height of rectangle
	
	// Default constructor
	Rectangle() {
		width = 1;
		height = 1;
	}
	// end of default constructor
	
	// The following parameterized constructor initializes
	// Parameterized constructors
	Rectangle (double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	} // End of parameterized constructor
	
	// The following getArea method calculates and returns the area of a rectangle
	// getArea method implementation
	double getArea() {
		return width * height;
	} // End of getArea method
	
	// The following getPerimeter method calculates and * returns the perimeter of a rectangle
	// getPerimeter method implementation
	double getPerimeter() {
		return 2 * (width + height);
	}

}
