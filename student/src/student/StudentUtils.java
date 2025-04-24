package student;

import java.util.Random;
import java.util.Scanner;
//public static <T> void sm(T t) {
//System.out.println(t);	
//}
public class StudentUtils {
	private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();
    
	public static String nextLine(String msg) {
		System.out.print(msg);
		return scanner.next();
	}
	
	public static int nextInt(String msg) {
		return Integer.parseInt(nextLine(msg));
	}
	
	public static boolean nextConfirm(String msg) {
		String s = nextLine(msg);
		return s.equalsIgnoreCase("y") || s.equalsIgnoreCase("yes");
	}
}