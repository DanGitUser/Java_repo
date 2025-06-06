package chapter1;

public class Literal {
	public static void main(String[] args) {
		String greet = "Hello, \nI am \"The Nameless,\" yeah.";
		String greet2 = "\tGreetings";
		
		System.out.println(greet);
		System.out.println(greet2);
		
		int i = 10;
		{
			System.out.println(i);
			double d = 10;
			System.out.println(d);
		}
		long l = 10;
		i = (int)l;
		
		byte b = (byte)128;
		//Normally, a byte type cannot contain 128, but by adding (byte) infront, we can force a byte type.
		System.out.println("1234567890123457689012345678901234576890");
		System.out.println(Long.toBinaryString(300));
		System.out.println(Math.PI);
		
		//300
		//1 0010 1100
	}
}
