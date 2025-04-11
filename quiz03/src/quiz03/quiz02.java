package quiz03;

import java.util.Arrays;

public class quiz02 {
	public static void main(String[] args) {
		int letter = 1;
		char alpha = (char) ('A' + letter - 1);
		System.out.println(alpha);
		String[] arrStr = {"a", "b", "c", };
		for(int i = 0 ; i < arrStr.length ; i++) {
			System.out.print(arrStr[i]);
		}
		int[] arr = new int[10];
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = i + 1;
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			int idx = (int)(Math.random() * 9); //0 ~ 44
			int tmp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = tmp;
		}
		int[] result = new int[10];
		for(int i = 0 ; i < result.length ; i++) {
			result[i] = arr[i];
		}
		System.out.println(arr.length);
		System.out.println(Arrays.toString(result));
	}
}
