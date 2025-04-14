package lesson02;

import java.util.Arrays;
import java.util.Iterator;

public class ArrEx16 {
	public static void main(String[] args) {
		int[] arrInt = {1,2,3,4,5};
		//index for
		//value can be changed
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = arrInt.length - arrInt[i];
			System.out.println(arrInt[i]);
		}
		System.out.println(Arrays.toString(arrInt));
		// for (Enhanced for)
		// value can't be changed
		for (int number : arrInt) {
			number = 10;
			System.out.println(number);
		}
		System.out.println(Arrays.toString(arrInt));
		
		int[][] arr = {{1,2,3}, {4,5}};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		for (int[] tmp : arr) {
			for (int n : tmp) {
				System.out.println(n);
			}
		}
		int age = 30;
		String name = "1234";
		String name2 = "1234";
		String n = new String ("1234");
		System.out.println("============");
		System.out.println(name);
		System.out.println(name2);
		System.out.println(n);
		System.out.println(name == name2);
		System.out.println(name == n);
		
		System.out.println(n.intern() == name.intern());
		System.out.println(n.equals(name));
	}
}
