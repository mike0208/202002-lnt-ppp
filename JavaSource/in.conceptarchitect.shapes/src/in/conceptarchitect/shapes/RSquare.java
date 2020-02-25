package in.conceptarchitect.shapes;

public class RSquare extends ProperRectangle{

	public RSquare(double side) {
		super(side,side);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public Orientation getOrientation() {
		// TODO Auto-generated method stub
		throw new RuntimeException("orientation is not supported in Square");
	}
}


