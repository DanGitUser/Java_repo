package lesson08;

import java.util.Arrays;

public class ArryCpyTst {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int idx = 0;
		System.arraycopy(args, idx + 1, arr, idx, arr.length - 1 - idx);
		System.out.println(Arrays.toString(arr));
	}
}
