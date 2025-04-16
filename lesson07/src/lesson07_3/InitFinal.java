package lesson07_3;

public class InitFinal {
	//초기화 순서
	//1. Class variable
	//2. Class reset block
	//3. Instance Variable
	//4. Instance reset block
	//5. Constructor
	static int si;
	int i;
	static void sm() {
		System.out.println(si);
//		System.out.println(i);
		
	}
	void m() {
		System.out.println(si);
		System.out.println(i);	
		System.out.println(this);
	}
	public static void main(String[] args) {
		InitFinal.sm();
		new InitFinal().m();
	}
}
