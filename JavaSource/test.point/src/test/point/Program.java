package test.point;

import in.conceptarchitect.shapes.Point;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1=Point.getCartisian(3, 4);	//new Point(3,4);
		
		System.out.println(p1);
		
		Point p2=Point.getPolar(5, 45);		//new Point(5,45);
		System.out.println(p2);
		
		
		Point p3=Point.getCartisian(3, 4);
		System.out.println(p3);
		
		
	}

}
