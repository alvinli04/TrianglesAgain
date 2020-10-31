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
	
	public String classify(){
		double a = getDist(v1, v2);
		double b = getDist(v2, v3);
		double c = getDist(v1, v3);
		a = Math.round(a*10000)/10000.0;
		b = Math.round(b*10000)/10000.0;
		c = Math.round(c*10000)/10000.0;
		if(a==b && b==c) return "equilateral";
		else if(a==b || b==c) return "isosceles";
		return "scalene";
	}

	public String toString(){
		return "v1(" + v1.getX() + ", " + v1.getY() + ") v2(" + v2.getX() + ", " + v2.getY() + ") v3(" + v3.getX() + ", " + v3.getY() + ")"; 
	}
}
