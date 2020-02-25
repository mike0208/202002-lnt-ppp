package in.conceptarchitect.drawing;

public class Square extends Rectangle{

	int size;

	public Square(int size) {
		super();
		this.size = size;
	}
	
	public int area() {
		return size*size;		
	}
	
	public int perimeter() {
		return 4*size;
	}
	
	public void draw() {
		System.out.println( "Square["+size+"] drawn");
	}
	
}
