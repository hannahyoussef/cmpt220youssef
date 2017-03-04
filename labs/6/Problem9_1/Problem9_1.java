import java.text.*;
public class Problem9_1 {

	public static void main(String[] args) {
		// Create two objects for Rectangle class one with width 4
		// and height 40 and another with width 3.5 and height 35.9
		
		// Create an object for Rectangle class with width 4 and height 40
		Rectangle rectangle1 = new Rectangle(4, 40);
		
		// Create another object for Rectangle class with width 3.5 and height 35.9
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		
		// Create an object for DecimalFormat class to format the output
		DecimalFormat df = new DecimalFormat("##.##");
		
		// Display the details width, height, area, and perimeter of both the
		// first and second rectangles
		
		// Display the details of the first rectangle
		System.out.println("\n Rectangle 1");
		System.out.println("-------------");
		System.out.println("Width: " + rectangle1.width);
		System.out.println("Height: " + rectangle1.height);
		System.out.println("Area: " + df.format(rectangle1.getArea()));
		System.out.println("Perimeter: " + rectangle1.getPerimeter());
		System.out.println();
		
		// Display the details of the second rectangle
		System.out.println("\n Rectangle 2");
		System.out.println("-------------");
		System.out.println("Width: " + rectangle2.width);
		System.out.println("Height: " + rectangle2.height);
		System.out.println("Area: " + df.format(rectangle2.getArea()));
		System.out.println("Perimeter: " + rectangle2.getPerimeter());
		

	}

}
