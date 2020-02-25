package in.conceptarchitect.geometry;

public class Rectangle extends Shape {

	double width, height;

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;

	}

	public double perimeter() {

		double p = 0;

		p = 2 * (width + height);

		return p;
	}

	public double area() {

		double a = 0;

		a = width * height;

		return a;

	}

	public void draw() {

		System.out.printf("Rectangle[ %f, %f] drawn\n", width, height);

	}
}
