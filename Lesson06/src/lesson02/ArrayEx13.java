package lesson02;

import java.util.Arrays;

public class ArrayEx13 {
	public static void main(String[] args) {
		// original array
		// 5 int array
		int[] arr = {10, 20, 30, 40, 50};
		
		//generate a new array with twice the length (5 -> 10)
		int[] tmp = new int[arr.length * 2];
		
		//copy the internal value to tmp
		//배열 내부의 값 복사
//		for (int i = 0; i < arr.length; i++) {
//			tmp[i] = arr[i];
//		}
		//               this v changes from which int the copy is going to start.
		System.arraycopy(arr, 4, tmp, 5, 1); //<- this number changes the amount to be copied
		//                this number ^ shifts the integers in arr to begin from index 2
		//참조값 복사
 		arr = tmp;
		System.out.println(Arrays.toString(arr));
		
		//copy using 'for', copies using arraycopy will have the area to be copied in advance
		
		int[] arr2 = Arrays.copyOf(arr, 20);
		System.out.println(Arrays.toString(arr2));
		
		int[] result = {1, 2, 3};
		result = Arrays.copyOf(result, result.length * 2);
		System.out.println(Arrays.toString(result));
		
		
		//
		
	}
}
