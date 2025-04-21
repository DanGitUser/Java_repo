package student;

import java.util.Random;
import java.util.Scanner;

public class StudentUtils {
	private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();
    
	public static String nextLine(String msg) {
		System.out.print(msg);
		return scanner.nextLine();
	}
	
	public static int nextInt(String msg) {
		return Integer.parseInt(nextLine(msg));
	}
	
	public static boolean nextConfirm(String msg) {
		String s = nextLine(msg);
		return s.equalsIgnoreCase("y") || s.equalsIgnoreCase("yes");
	}
	
//	public static String inputName(String msg) {
//        while (true) {
//        	System.out.print(msg);
//        	String input = scanner.nextLine();
//        	if (input.length() >= 2 && input.length() <=4) {
//        		boolean isKor = true;
//        		for (char ch : input.toCharArray()) {
//        			if (ch < '가' || ch > '힣') {
//        				isKor = false;
//        				break;
//        			}
//        		}
//        		if (isKor) return input;
//        	}
//        }
//    }
	
//    public static int checkRange(String subject) {
//        while (true) {
//            try {
//                System.out.print(subject + " 점수 (0 ~ 100) > ");
//                int score = Integer.parseInt(scanner.nextLine());
//                if (score >= 0 && score <= 100) {
//                    return score;
//                }
//                System.out.println("0 ~ 100 사이");
//            } catch (NumberFormatException e) {
//                System.out.println("숫자 입력");
//            }
//        }
//    }
}