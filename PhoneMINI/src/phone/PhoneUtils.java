package phone;

import java.util.Scanner;

public class PhoneUtils {
	private static final Scanner scanner = new Scanner(System.in);
    
	public static String nextLine(String msg) {
		System.out.print(msg);
		return scanner.next();
	}
	
	public static int nextInt(String msg) {
		return Integer.parseInt(nextLine(msg));
	}
	
	public static long nextLong(String msg) {
		return Long.parseLong(nextLine(msg));
	}
	
	public static boolean nextConfirm(String msg) {
		String s = nextLine(msg);
		return s.equalsIgnoreCase("y") || s.equalsIgnoreCase("yes");
	}
}
