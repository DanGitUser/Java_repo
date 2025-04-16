package lesson08.shape;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(3);
//		System.out.println(circle.area());//Area
//		System.out.println(circle.circum());//Circumference
		
		Rect rect = new Rect(4, 5);
//		System.out.println(rect.area());//Area
//		System.out.println(rect.circum());//Circumference
		
		Shape[] shapes = {circle, rect};
		
		for (int i = 0; i < shapes.length; i++) {
			System.out.println("===" + shapes[i].getClass().getSimpleName() + "===");
			System.out.println(shapes[i].area());;
			System.out.println(shapes[i].circum());;
		}
	}
}
