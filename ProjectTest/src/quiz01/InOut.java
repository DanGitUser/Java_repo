package quiz01;

public class InOut {
	public static void main(String[] args) {
		Outer out = new Outer();
//		Outer.Inner();
	}
}

class Outer {

	class Inner {
		int i = 10;
	}
}