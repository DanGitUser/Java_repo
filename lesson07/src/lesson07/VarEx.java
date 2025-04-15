package lesson07;

public class VarEx {
	public static void main(String[] args) {
		
		System.err.println("Avante Manufacturer :" +Avante.company);
		
		Avante a1 = new Avante();
		Avante a2 = new Avante();
		
		a1.color = "white";
		a2.color = "black";
		
		System.out.println("a1 color: " + a1.color);
		System.out.println("a2 color: " + a2.color);
		
		System.out.println("a1 manufaturer : " + a1.company);
		System.out.println("a2 manufaturer : " + a2.company);
		
		a1.company = "Kia";
		
		System.err.println("Avante Manufacturer :" +Avante.company);
		System.out.println("a1 manufaturer : " + a1.company);
		System.out.println("a2 manufaturer : " + a2.company);
		
	}
}
class Avante {
	String color;
	static String company = "Hyundai";
}
