package in.conceptarchitect.shapes;

import java.util.HashSet;

public class Point {
	double x,y;

	private Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
		System.err.println("\nDEBUG: "+this+" created");
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public double getR(){
		return Math.sqrt(x*x+y*y);
	}
	
	public double getTheta(){
		
		double rad= Math.atan(y/x);
		
		return rad*180/Math.PI;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", R=" + getR() + ", Theta=" + getTheta() + "]";
	}
	
	
	/*public Point(double r, double theta){
		
		double rad= theta*Math.PI/180;
		this.x= r* Math.cos(rad);
		this.y=r*Math.sin(rad);
		
	}*/
	
	
	public static Point getCartisian(double x,double y){
		return getPoint(x,y);
	}
	
	public static Point getPolar(double r,double theta){
		double rad= theta*Math.PI/180;
		double x= r* Math.cos(rad);
		double y=r*Math.sin(rad);
		return getPoint(x,y);
	}
	
	private static Point getPoint(double x,double y){
		
		for(Point p: cache){
			if(p.x==x && p.y==y)
				return p;
		}
		
		Point p=new Point(x,y);
		cache.add(p);
		return p;
	}
	
	static HashSet<Point> cache=new HashSet<>();
	
	
	
	
}
