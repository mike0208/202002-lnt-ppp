package in.conceptarchitect.drawing;

public class RSquare extends ProperRectangle {

	public RSquare(int side) {
		super(side,side);
		// TODO Auto-generated constructor stub
	}
	
	@Override	
	public Orientation orientation() {
		// TODO Auto-generated method stub
		//return super.orientation();
		//violates LSP <--- unexpected exception
		throw new RuntimeException("Orientation is NOT Supported");
	}

}
