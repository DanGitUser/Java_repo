package Lesson08_2;

public class AbsMAin {
	public static void main(String[] args) {
		
	}
}

abstract class Parent {
	abstract void m();
}
abstract class Child extends Parent{
	
}
abstract class GrandChild extends Child{
	void m() {
		
	}
}
class GrandGrandChild extends GrandChild{

}
