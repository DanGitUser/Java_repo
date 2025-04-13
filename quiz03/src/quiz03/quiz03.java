package quiz03;

import java.util.Arrays;

public class quiz03 {
	public static void main(String[] args) {
		int[] arr = new int[100]; //100 numbers
		for (int i = 0; i < arr.length; i++) {
		    arr[i] = (int)(Math.random() * 10); //0 ~ 9 number generation.
		}
		System.out.println("Original\n" + Arrays.toString(arr) + "\n");
		for(int i = 0 ; i < arr.length -1 ; i++) {
			
			for(int j = 0 ; j < arr.length -1 -i ; j++) {
				if(arr[j] > arr[j + 1]) {
					
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorted\n" + Arrays.toString(arr) + "\n");
		
		int[] count = new int[10]; //This holds the counts for numbers 0 to 9
		for (int num : arr) {
			count[num]++; // This increases for the count of each number from 0 to 9
		}
		
		System.out.println("huffman sorting (0 ~ 9) :\n");
		for (int i = 0 ; i < count.length ; i++) {
			System.out.println(i + ": " + count[i]);
		}
	}
}