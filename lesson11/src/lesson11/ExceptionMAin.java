package lesson11;

public class ExceptionMAin {
	public static void main(String[] args) {
		//try, catch, finally, throw, throws
		
		int i = 1;
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(args[0]);
			System.out.println(3 / 0);
			System.out.println(4);
		}
		catch (NullPointerException e) {
			System.out.println(5);
		}
		catch (ArithmeticException e) {
			System.out.println("a");
		}
		catch (RuntimeException e) {
			System.out.println("a");
		}
		finally {
			
		}
		System.out.println(6);
	}
}
