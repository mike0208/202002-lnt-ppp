package in.conceptarchitect.shapes;

public class Square extends Rectangle {

	double side;

   Square(double side) {
		super();
		this.side=side;
		
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
	
	
	public double area(){
		return side*side;
	}
	
	public double perimeter(){
		return 4*(side);
	}
	
	public void draw(){
		System.out.println(this+" drawn");
	}
	
	
}
