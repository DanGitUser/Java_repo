package lesson07;

public class MethodEx {
	public static void main(String[] args) {
		int result = add(10, 20);
		System.out.println(result);
		print("hello");
		System.out.println(addAll(1, 2, 3));
		//Stack
		return;
		
	}
	
	static int add (int a, int b) {
		return a + b;
	}
	
	static int addAll(int... nums) { //adding ... extends the value
		int ret = 0;
		for (int n : nums) {
			ret += n;
		}
		return ret;
	
	}
	static void print (String s) {
		System.out.println(s);
	}
}


