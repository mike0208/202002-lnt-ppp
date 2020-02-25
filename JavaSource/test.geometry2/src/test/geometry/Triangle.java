package test.geometry;

import in.conceptarchitect.geometry.Shape;

public class Triangle extends Shape {

	double s1,s2,s3;
	
	
	public Triangle(double s1, double s2, double s3) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		double s=perimeter()/2;
		return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return s1+s2+s2; // a bug
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.printf("Triangle <%f,%f,%f> drawn",s1,s2,s3);
	}

}
