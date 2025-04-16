package lesson07_3;

public class InitEx {
	
	InitEx() {
		System.out.println("Constructor out");
	}
	
	static {
		System.out.println("Class reset block intiation");
	}
	
	{
		System.out.println("Instance reset block intiation");
	}
	
	public static void main (String[] args) {
		System.out.println("main Method Start");
		System.out.println("main init 1 class construction");
		new InitEx();
		System.out.println("main init 2 class construction");
		new InitEx();
		System.gc();
	}
}
