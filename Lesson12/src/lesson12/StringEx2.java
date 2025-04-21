package lesson12;

public class StringEx2 {
	public static void main(String[] args) {
		String str = "";
		long start = System.currentTimeMillis();
		System.out.println(start);
		//1970. 1. 1. 00:00:00 start
		//until now in ms
		for (int i = 0; i < 1000000; i++) {
			str += "0" + str;
		}
		long end = System.currentTimeMillis();
		System.out.println(end);
		System.out.println(str.length());
		System.out.println(end - start + "ms");
		
		start = System.currentTimeMillis();
		System.out.println("================");
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 300000000; i++) {
			sb.append("0");		
		}
		end = System.currentTimeMillis();
		System.out.println(sb.length());
		System.out.println(end - start + "ms");
		
		// String to StringBuffer
		StringBuffer sb2 = new StringBuffer(str);
		//StringBuffer to String

	}
}
