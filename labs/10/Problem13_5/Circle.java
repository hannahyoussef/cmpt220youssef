package Problem13_5;
import Problem13_1.GeometricObject;

public class Circle
		extends GeometricObject {
	private double radius;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, 
		String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}

	/** Return radius */
	public double getRadius() {
		return radius;
	}

	/** Set a new radius */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override /** Return area */
	public double getArea() {
		return radius * radius * Math.PI;
	}

	/** Return diameter */
	public double getDiameter() {
		return 2 * radius;
	}

	@Override /** Return perimeter */
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	@Override /** Return String description of Circle object */
	public String toString() {
		return super.toString() + "\nRadius: " + radius + "\nArea: " + getArea() +
			"\nDiameter: " + getDiameter() + "\nPerimeter: " + getPerimeter();
	}

	public static Circle max(Circle circle1, Circle circle2) {
		// TODO Auto-generated method stub
		return null;
	}
}