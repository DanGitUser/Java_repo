package lesson11;

public class Exception5x5 {
	public static void main(String[] args) {
		System.out.println("Program Start");
		try {
			throw new Exception("Exception Occured");
		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
			StackTraceElement[] ste = e.getStackTrace();
			for(StackTraceElement st : ste) {
				System.out.println(st.getLineNumber());
			}
		}
		System.out.println("Program Terminated");
		int[] arr = {1,2,3,4};
		int[] arr2 = arr.clone();
	}
	static void m() throws Exception{
		System.out.println(1);
		throw new Exception("Exception of m");
	}
	
	static void m2() {
		try {
			m();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
