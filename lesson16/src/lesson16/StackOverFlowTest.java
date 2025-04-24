package lesson16;

public class StackOverFlowTest {
	public static void main(String[] args) {
//		main(args);
		new Data();
		
	}
}
//The static keyword in Java is used to indicate that a variable or method belongs to the class itself rather than to instances of the class. This means that static members are shared among all instances and can be accessed without creating an object of the class.
class Data {
	
	int i = print(1);
	static int si = print(2);
	{	
		System.out.println("lal");
	}
	static {
		System.out.println("lal1");
	}
	public Data() {
		System.out.println("lal2");
		
	}
	static int print(int i) {
		System.out.println("print" + i);
		return i;
	}
}
