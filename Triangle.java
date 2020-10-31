import java.util.*;

public class Triangle{

	private Point v1, v2, v3;

	public Triangle(Point a, Point b, Point c){
		v1 = a;
		v2 = b;
		v3 = c;
	}

	public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
		v1 = new Point(x1, y1);
		v2 = new Point(x2, y2);
		v3 = new Point(x3, y3);
	}
	
	public static double getDist(Point a, Point b){
		return Math.sqrt((a.getX() - b.getX())*(a.getX() - b.getX()) + (a.getY() - b.getY())*(a.getY() - b.getY()));
	}

	public double getPerimeter(){
		return getDist(v1, v2) + getDist(v2, v3) + getDist(v1, v3);
	}	

	public double getArea(){
		double a = getDist(v1, v2);
		double b = getDist(v2, v3);
		double c = getDist(v1, v3);
		double s = (a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}

}
