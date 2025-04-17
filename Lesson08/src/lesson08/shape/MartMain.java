package lesson08.shape;

public class MartMain {
	public static void main(String[] args) {
		Buyer seong = new Buyer();
		seong.buy(new AirCon());
		seong.display();
		seong.buy(new Computer());
		seong.buy(new Computer());
		seong.display();
		seong.buy(new Computer());
		seong.display();
	}
}

//기반 클래스
class Product {
	int price;
	public Product(int price) {
		this.price = price;
	}
	public String toString() {
		return getClass().getSimpleName() + "[" + price + "]";
		
	}
}

class Cooker extends Product {
	public Cooker() {
		super(50); //stored in parent class 'int price'
	}
	
}

class Computer extends Product {
	public Computer() {
		super(200);
	}
}

class AirCon extends Product {
	public AirCon() {
		super(500);
	}
}

class Buyer {
	Product[] products = new Product[10];
	int count;
	int wallet = 1000;
	
	public void buy(Product product) {
		if (product.price <= wallet) {
			products[count++] = product;
			wallet -= product.price;
		}
		else {
			System.out.println("You are poor");
		}
	}
	
	public void display() {
		System.out.println("Puurchase history");
		String str = "";
		for (int i = 0; i < count; i++) {
			str += products[i] + " ";
		}
		System.out.println(str);
		System.out.println("Current cash : " + wallet);
	}
	
	
}