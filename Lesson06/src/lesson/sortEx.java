package lesson;

import java.util.Arrays;

public class sortEx {
	public static void main(String[] args) {
        int[] arr = new int[100];    
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10);
        }
        System.out.println("Original array: " + Arrays.toString(arr));
        
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                	
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    swapped = true;
                }
            }
            System.out.println("After run number " + (i + 1) + ": " + Arrays.toString(arr));
            if (!swapped) {
                break;
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
