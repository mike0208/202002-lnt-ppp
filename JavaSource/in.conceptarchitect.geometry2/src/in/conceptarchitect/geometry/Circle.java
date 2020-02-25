package in.conceptarchitect.geometry;

public class Circle extends Shape{
	double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;

	}

	public double perimeter() {

		double p = 0;

		p = 2 * Math.PI * radius;

		return p;
	}

	public double area() {

		double a = 0;
		a = Math.PI * radius * radius;

		return a;

	}

	public void draw() {

		System.out.println("Circle (" + radius + ") drawn");

	}
}
