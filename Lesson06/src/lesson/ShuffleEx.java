package lesson;

import java.util.Arrays;

public class ShuffleEx {
	public static void main(String[] args) {
		int[] arr = new int[100];
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = i + 1;
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			int idx = (int)(Math.random() * 45); //0 ~ 44
			int tmp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = tmp;
		}
		int[] result = new int[5];
		for(int i = 0 ; i < result.length ; i++) {
			result[i] = arr[i];
		}
		System.out.println(Arrays.toString(result));
	}
}
