package lesson08;

public class SmartPhoneMain {
	public static void main(String[] args) {
		
		Phone p = new Phone();
		p.name = "Phone";
		p.company = "Hyundai";
		p.color = "White";
		
		System.out.println("Phone output");
		System.out.println(p.name);
		System.out.println(p.company);
		System.out.println(p.color);
		p.call();
		p.recieve();
		
		SmartPhone sp = new SmartPhone();
		sp.name = "galaxy";
		sp.company = "samsung";
		sp.color = "black";
		
		System.out.println("Phone output");
		System.out.println(sp.name);
		System.out.println(sp.company);
		System.out.println(sp.color);
		sp.call();
		sp.recieve();
		sp.installApp();
	}
}
