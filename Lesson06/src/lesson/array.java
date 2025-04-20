package lesson;

import java.util.Arrays;

public class array {
	public static void main(String[] args) {
		//array
		int i = 10;
		int[] arr = new int[]{10, 20, 30, 40};
		int[] arrInt = new int[5];
		int[] arr1 = {1,2,3};
		int[] arr2 = new int [3];
		int[] arr3 = new int[] {5,6,7,8};
 		arr[0] = 60;
		arr[1] = arr[2];
		arr[3] = i;
		arr1 = new int[] {10, 40, 50};
		arr1 = new int[10];
		System.out.println(arrInt);		
	 	System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		String[] arr4 = new String[3];
		System.out.println(Arrays.toString(arr4));
		
		char ch = '가';
		ch = 44032;
		ch = '\uAC00';
		ch = 0xac00;
		//A = 65
		//a = 97
		//0 = 48
		

		

	}
	
}
