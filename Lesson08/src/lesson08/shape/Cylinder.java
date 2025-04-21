package lesson08.shape;

public class Cylinder extends Shape implements Shape3D{
	Circle circle;
	int z;
	
	Cylinder() {
		
	}
	Cylinder(Circle circle, int z) {
		this.circle = circle;
		this.z = z;
	}
	public double area() {
		return circle.area() * z + circle.circum() * z;
	}
	
	public double volume() {
		return circle.area() * z;
	}
}
