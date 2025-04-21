package lesson08.shape;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(3);
//		System.out.println(circle.area());//Area
//		System.out.println(circle.circum());//Circumference
		
		Rect rect = new Rect(4, 5);
//		System.out.println(rect.area());//Area
//		System.out.println(rect.circum());//Circumference
		
		Cylinder cylinder = new Cylinder(new Circle(4), 5);
		
		Shape[] shapes = {circle, rect, cylinder};
		
		for (int i = 0; i < shapes.length; i++) {
			System.out.println("===" + shapes[i].getClass().getSimpleName() + "===");
			System.out.println("Width : " + shapes[i].area());;
			if (shapes[i] instanceof Shape2D) {
				System.out.println("Circumfirence : " + ((Shape2D)shapes[i]).circum());
			}
			else if (shapes[i] instanceof Shape3D) {
				System.out.println("Volume : " + ((Shape3D)shapes[i]).volume());
			}
//			System.out.println(shapes[i].circum());;
		}
		System.out.println("=================");
	}
}
