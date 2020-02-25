package in.conceptarchitect.shapes;

public class ProperRectangle extends Rectangle{

	double width,height;

    ProperRectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	
	public double area(){
		return width*height;
	}
	
	public double perimeter(){
		return 2*(width+height);
	}
	
	public void draw(){
		System.out.println(this+" drawn");
	}
	
	public Orientation getOrientation(){
		if(width>height)
			return Orientation.Sleeping;
		else
			return Orientation.Standing;
	}
	
}
