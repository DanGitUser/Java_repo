package lesson07;

import java.util.Arrays;

//�Ǻ���ġ ���� ���
//�ݺ��� ����
//�Ǻ���ġ ���� ���� 20�� ���
//��Ģ: ù ���ڸ� ������ ���� ���� ������ ��. �״��� ���ڴ� ���� �� ������ ���� ����
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
