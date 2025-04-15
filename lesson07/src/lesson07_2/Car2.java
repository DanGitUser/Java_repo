package lesson07_2;

public class Car2 {
	String color;
	String company;
	String type;
	
	Car2() {
		this("white", "Kia", "transport");
	}
	Car2(String color, String company, String type) {
		this.color = color;
		this.company = company;
		this.type = type;
	}
	Car2(String com, String t) {
		this("white", com, t);
	}
	Car2(String t) {
		this("white", "Kia", t);
	}
	public String toString() {
		return color + "-" + company + "-" + type;
	}
}
