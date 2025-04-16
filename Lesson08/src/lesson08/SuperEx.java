
package lesson08;

public class SuperEx {
	public static void main(String[] args) {
		
		Child child = new Child();
		child.print();
		
	}
}

class Parent {
	
	int number = 3;
	
	Parent() {
		super();
		System.out.println("Parent class construct");
		
	}
}

class Child extends Parent {
	
	int number = 2;
	
	Child() {
		System.out.println("Child class construct");
		
	}
	
	void print() {
		int number = 1;
		System.out.println(number);
		System.out.println(this.number);
		System.out.println(super.number);
	}
}
