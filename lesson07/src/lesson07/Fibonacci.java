package lesson07;

import java.util.Arrays;

//�Ǻ���ġ ���� ���
//�ݺ��� ����
//�Ǻ���ġ ���� ���� 20�� ���
//��Ģ: ù ���ڸ� ������ ���� ���� ������ ��. �״��� ���ڴ� ���� �� ������ ���� ����
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
