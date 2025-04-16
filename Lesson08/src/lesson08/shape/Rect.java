package lesson08.shape;

public class Rect extends Shape{
	int x, y;
	
	public Rect() { }
	public Rect(int x, int y) {
		this.x = y;
		this.y = y;
	}
	
	public double circum() {
		return (x + y) * 2;
	}
	public double are() {
		return x + y;
	}
}
