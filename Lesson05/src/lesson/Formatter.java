package lesson;

public class Formatter {
	public static void main(String[] args) {
		String str = "001 002 003";
		String str2 = String.format("%03d %03d %03d\n", 1, 2, 3);

		System.out.println(str);
		
		System.out.printf("%03d %03d %03d\n", 1, 2, 3);
		
		System.out.println(str2);
		
		// %d >> 정수 (10 진수)
		// %x >> 정수 (10 진수)
		// %o >> 정수 (10 진수)
		// %f >> 실수
		// %s >> 문자열
		// %ㅊ >> 문자
		
		System.out.printf("%d %x %X %o %f\n", 30, 30, 30, 30, 30d);

		int hex = 0x1e;
		System.out.println(hex);
		
		int oct = 0036;
		System.out.println(oct);
		
		int bin = 0b1111;
		System.out.println(bin);
		
		String result = "";
		for(int i = 1 ; i <= 100 ; i++) {
			result += String.format("%03d", i);
		}
		
		System.out.println(result);
		
		for(int i = 'a' ; i < 'z'+1 ; i++) {
			System.out.print((char)i);
		}
		for(int i = 'A' ; i < 'Z'+1 ; i++) {
			System.out.print((char)i);
		}
		//unicode 기반의 한글, 초성 19게
		//종성유무의 간격
	}
}
