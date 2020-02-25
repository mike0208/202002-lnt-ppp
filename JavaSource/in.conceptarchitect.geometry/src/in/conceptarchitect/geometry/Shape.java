package in.conceptarchitect.geometry;

public class Shape {

	double width,height;
	double radius;
	ShapeType shapeType;
	double s1,s2,s3; //OCPx2
	
	
	
	//OCPx3
	public Shape(double s1, double s2, double s3) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		shapeType=ShapeType.Triangle;
	}
	
	public Shape(double width, double height) {
		super();
		this.width = width;
		this.height = height;
		shapeType=ShapeType.Rectangle;
	}
	public Shape(double radius) {
		super();
		this.radius = radius;
		shapeType=ShapeType.Circle;
	}
	
	public double perimeter(){
		
		double p=0;
		
		
		
		if(shapeType==ShapeType.Circle)
			p=2*Math.PI*radius;
		//missing else
		if(shapeType==ShapeType.Triangle)
			p=s1+s2+s3;
		else
			p=2*(width+height);
		
		return p;
	}
	
	
	public double area(){
		
		double a=0;
		
		switch(shapeType){
		
		case Circle: 
			a=Math.PI*radius*radius;
			break;
		case Rectangle:
			a=width*height;
			//missing break leading to bug
		case Triangle:
		{
			double s=perimeter()/2;
			a=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
		}
		
		}
		
		return a;
		
		
	}
	
	
	public ShapeType getShapeType() {
		return shapeType;
	}
	public void draw(){
		
		if(shapeType==ShapeType.Circle)
			System.out.println("Circle ("+radius+") drawn");
		else if(shapeType==ShapeType.Triangle)
			System.out.printf("Triangle <%f,%f,%f> drawn",s1,s2,s3);
		else
			System.out.printf("Rectangle[ %f, %f] drawn\n",width,height);
			
	}
	
	
	
	
}
