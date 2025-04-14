package lesson07;

import java.util.Arrays;

//피보나치 수열 출력
//반복문 관련
//피보나치 수열 숫자 20개 출력
//규칙: 첫 두자리 숫자의 합이 다음 숫자의 합. 그다음 숫자는 이전 두 숫자의 합의 연속
//1 1 2 3 5 8 13 21 ....
public class Fibonacci {
	public static void main(String[] args) {
		
		int num = 20;
		int[] result = new int[num];
		
		result[0] = 1;
		result[1] = 1;
		
		for (int i = 2; i < num; i++) {
			result[i] = result[i - 1] + result[i - 2];
		}
		System.out.println("Result :" + Arrays.toString(result));
	}
}
