package test.geometry;

import in.conceptarchitect.geometry.Shape;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape []shapes={
				new Shape(8,3),	//Rectangle
				new Shape(3,4,5), //Triangle
				new Shape(7) //Circle
		};

		for(Shape shape:shapes){
			System.out.println(shape.getShapeType());
			System.out.println("area="+shape.area());
			System.out.println("permieter="+shape.perimeter());
			shape.draw();
			System.out.println("\n\n");
		}
		
	}

}
