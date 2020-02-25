package test.rectangle;


import in.conceptarchitect.shapes.ProperRectangle;
import in.conceptarchitect.shapes.RSquare;
import in.conceptarchitect.shapes.Rectangle;
import in.conceptarchitect.shapes.RectangleCreator;
import in.conceptarchitect.shapes.Square;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle [] shapes={
		                         RectangleCreator.create(3, 7), //new ProperRectangle(3,7),
		                         RectangleCreator.create(8, 8),	//new ProperRectangle(8,8),
		                         RectangleCreator.createSquare(8),//new Square(8),
		                       //  new ProperRectangle(8,8),
		                         RectangleCreator.create(8, 4)//new ProperRectangle(8,4)
					};
		
		
		for(Rectangle x: shapes){
			show(x);
		}
	}

	private static void show(Rectangle x) {
		x.draw();
		System.out.print("area="+x.area());
		System.out.println("\tperimeter="+x.perimeter());
		
		if(x instanceof ProperRectangle){
			System.out.println("orientation is "+((ProperRectangle)x).getOrientation());
		}
		System.out.println();
	}

}
