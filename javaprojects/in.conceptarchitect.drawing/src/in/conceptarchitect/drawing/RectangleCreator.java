package in.conceptarchitect.drawing;

public class RectangleCreator {

	public static Rectangle create(int x,int y) {
		
		if(x==y)
			return new Square(x);
		else
			return new ProperRectangle(x,y);
	}
}
