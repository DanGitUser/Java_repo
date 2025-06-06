package Lesson04;

public class OpEx2_3 {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);

		boolean c = a == b;
		System.out.println("c : " + c);
		boolean d = !c;
		System.out.println("d : " + d);
		//가힣 
		
		System.out.println('힣' - '가' + 1);
		System.out.println(('힣' - '가' + 1) / 19);
		
		// AND : ONLY TRUE WHEN BOTH OR TRUE
		// OR : ONLY FALSE WHEN BOTH ARE FALSE
		
		//boolean e
		//the sum of 'a' is a positive integer but smaller than 20?
		
		//boolean e = a > 0 && a < 20;
		boolean e = a % 2 == 1 || a % 5 ==0;

		//논리연산
		//논리곱 && 논리합 || 눈리부정 !
		
		//비트연산
		//비트곱 & 비트합 | 비트부정 ~ 비트배타합 ^
		
		System.out.println(9 & 5);
		System.out.println(9 | 5);
		System.out.println(9 ^ 5);
		// 9 : 1001
		// 5 : 0101
		
		System.out.println(~5);
		
		// >> , << , >>>
		// ex: <<
		//When using the symbol above
		//9 (which is 1001) will 'move' two spaces left
		// 1001 -> 100100 (the additional 00 comes from the move)
		
		System.out.println(-4 << 2);
		System.out.println(-4 >> 2);
		System.out.println(-4 >>> 2);
		
		System.out.println(Integer.toBinaryString(-4 >>> 2));
		
		
		}	
}
