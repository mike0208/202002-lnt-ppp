package in.conceptarchitect.drawing;

public class ProperRectangle extends Rectangle {
	
	int width,height;

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}
	

	public void setHeight(int height) {
		this.height = height;
	}

	//can't be accessed by the client
	//but accessible within the package!
	ProperRectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	public Orientation orientation() {
		if(width>height)
			return Orientation.sleeping;
		else
			return Orientation.standing;
	}

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return width*height;
	}

	@Override
	public int perimeter() {
		// TODO Auto-generated method stub
		
		return 2*(width+height);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle["+width+","+height+"] drawn");
	}
	
	
}
