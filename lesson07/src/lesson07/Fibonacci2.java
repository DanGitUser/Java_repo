package lesson07;

import java.util.Arrays;

//피보나치 수열 출력
//반복문 관련
//피보나치 수열 숫자 20개 출력
//규칙: 첫 두자리 숫자의 합이 다음 숫자의 합. 그다음 숫자는 이전 두 숫자의 합의 연속
//1 1 2 3 5 8 13 21 ....
public class Fibonacci2 {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 1;
		System.out.print("1 1 ");
		for (int i = 0; i < 18; i++) {
			int c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}
}
