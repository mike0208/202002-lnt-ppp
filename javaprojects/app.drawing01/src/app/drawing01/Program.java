package app.drawing01;

import in.conceptarchitect.drawing.ProperRectangle;
import in.conceptarchitect.drawing.RSquare;
import in.conceptarchitect.drawing.Rectangle;
import in.conceptarchitect.drawing.RectangleCreator;
import in.conceptarchitect.drawing.Square;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle[] rectangles = { 
				RectangleCreator.create(3,9),   //new ProperRectangle(3, 9), // standing rectangle
				RectangleCreator.create(8, 8),  //new Square(8), 
				//new ProperRectangle(5,5),       //still works the bad way
				RectangleCreator.create(11, 2), //new RSquare(11),
		};

		for (Rectangle rectangle : rectangles) {
			rectangle.draw();
			System.out.println("area:" + rectangle.area());
			System.out.println("perimeter:" + rectangle.perimeter());

			testProperRectangle(rectangle);
			System.out.println();
		}

	}

	private static void testProperRectangle(Rectangle rectangle) {
		if (rectangle instanceof ProperRectangle) {
			ProperRectangle r = (ProperRectangle) rectangle;
			//client has no idea there may be an exception here
			System.out.println("orientation:" + r.orientation());
			System.out.println("chaing rectangle height!");
			r.setHeight(15);
			rectangle.draw();
		}
	}

}
