package lesson12_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReEx {
	public static void main(String[] args) {
		String regex = "\\d";
		regex = "[0-9]";
		regex = "\\D";
		regex = "[^0-9]";
		System.out.println(regex);
		Pattern p = Pattern.compile("b[^A-Za-z]*");
		Matcher m;
		String[] strs = {"bat", "cat", "bed", "bAt", "Bat", "b", ""};
		
		for(String s : strs) {
			m = p.matcher(s);
			System.out.println(s + " = " + m.matches());
		}
		String tel = "01[0-9]-[0-9]{3,4}-[0-9]{4}";
		String p1 = "010-1010-1111";
		System.out.println(p1.matches(tel));
		
		System.out.println("abcd1234abcd".replace("a", "e"));
		System.out.println("abcd1234abcd".replaceFirst("a", "e"));
	}
//	public String inputName() {
//		String name = StudentUtils.nextLine("이름 > ");
//		if (name.length() < 2 || name.length() > 4) {
//			throw new IllegalArgumentException("2 ~ 4 글짜");
//		}
//		for (int i = 0; i < name.length(); i++) {
//			if(name.charAt(i) < '가' || name.charAt(i)> '힣') {
//				throw new IllegalArgumentException("한글만");
//			}
//		}
//		return name;
//	}
}
