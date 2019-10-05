
public class Point {

	private int x;
	private int y;
	
	public Point() {
		
	}
	
	public Point (int x, int y) {
		this.x = x;
		this.y = y;		
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public double distance() {
		double distance = Math.sqrt((0 - this.x) * (0 - this.x) + ((0 - this.y) * (0 - this.y)));
		return distance;
	}
	
	public double distance(int px, int py) {
		double distance = Math.sqrt((px - this.x) * (px - this.x) + (py - this.y) * (py - this.y));
		return distance;
	}
	
	public double distance(Point p1) {
		double distance = Math.sqrt((p1.x - this.x) * (p1.x - this.x) + (p1.y - this.y) * (p1.y - this.y));
		return distance;
	}
}
