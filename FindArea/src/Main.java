
public class Main {

	public static void main(String[] args) {
		var circleArea = area(-1);
		var rectangleArea = area(-1.0, 4.0);
		System.out.println("The area of the circle is "+circleArea);
		System.out.println("The area of the rectangle is "+rectangleArea);
	}
	
	public static double area(double radius) {
		if (radius <= 0) {
			return -1;
		}
		double a = radius * radius * 3.14159;
		return a;
	}
	public static double area(double x, double y) {
		if (x <= 0 || y <= 0) {
			return -1;
		}
		double a = x * y;
		return a;
	}
}
