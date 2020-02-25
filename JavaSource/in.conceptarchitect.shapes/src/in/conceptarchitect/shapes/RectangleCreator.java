package in.conceptarchitect.shapes;

public class RectangleCreator {

	public static Rectangle create(double x,double y){
		
		if(x==y)
			return new Square(x);
		else
			return new ProperRectangle(x, y);
		
	}
	
	public static Rectangle createSquare(double x){
		return new Square(x);
	}
}
