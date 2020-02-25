package test.geometry;

import in.conceptarchitect.geometry.Circle;
import in.conceptarchitect.geometry.Rectangle;
import in.conceptarchitect.geometry.Shape;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape []shapes={
				new Rectangle(8,3),	
				new Triangle(3,4,5),
				new Circle(7) 
		};

		for(Shape shape:shapes){
			System.out.println(shape.getClass().getName());
			System.out.println("area="+shape.area());
			System.out.println("permieter="+shape.perimeter());
			shape.draw();
			System.out.println("\n\n");
		}
		
	}

}
