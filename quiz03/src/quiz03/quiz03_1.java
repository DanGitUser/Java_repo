package quiz03;

import java.util.Arrays;

public class quiz03_1 {
	public static void main(String[] args) {
		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10);
		}
		System.out.println(Arrays.toString(arr));
		
		int[] count = new int[10];
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		
		System.out.println("huffman sorting (0 ~ 9) :\n");
		System.out.println(Arrays.toString(count));
	}
}
