package lesson;

import java.net.MulticastSocket;
import java.util.Scanner;

public class han {
	public static void main(String[] args) {
/*		//number of korean char
		System.out.println('힣' - '가' + 1); //11172
		
		//초성당 글자 갯수
		System.out.println('힣' - '하' + 1); // 588
		
		//초성의 갯수
		System.out.println(11172 / 588);
		System.out.println(19 * 588);
		
		//종성간 거리
		System.out.println('개' - '가');
		
		//특정 글자가 받침 있다 없다 boolean
		// 가 = 44032
		// 각 - 가 = 1 (44033 - 44032
		//받침 있다 = true
		char ch = '강';
		System.out.println((ch - '가') % 28 != 0);
*/		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a korean character : ");
		String inputStr = scanner.nextLine();
		
		char ch = inputStr.charAt(inputStr.length() - 1);
		boolean hasLast = (ch - '가') % 28 != 0;
		
		String output = "The word to be used is as\n";
		output += inputStr + (hasLast ? "은" : "는") + "\n";
		output += inputStr + (hasLast ? "이" : "가") + "\n";
		output += inputStr + (hasLast ? "을" : "를") + "\n";
		
		System.out.println(output);
	} 
}
