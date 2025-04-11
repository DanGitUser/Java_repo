package lesson;

import java.util.Arrays;

public class Lotoo {
	public static void main(String[] args) {
		int[] lotto = new int[10];
		int idx = 0;
		while(true) { //infinite loop if there is no break.
			int number = (int)(Math.random() * 45 + 1) ;
			
			boolean insert = true;
			
			for(int i = 0 ; i <= idx ; i++) {
				if(lotto[i] == number) {
					insert = false;
					break; //for break
				}
			}
			
			if(insert) {
				lotto[idx] = number;
				idx++;
			}
			if(idx == 10) break; //while break
		}
		int[] arr = lotto;
		for(int i = 0 ; i < arr.length -1 ; i++) {
			System.out.println("run number " + (i + 1));
			for(int j = 0 ; j < arr.length -1 -i ; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
				System.out.println(Arrays.toString(arr));
			}
		}
//		Integer[] arr2 = {1,2,3,4,5};
//		Arrays.sort(arr2, (a,b) -> b - a);;
//		System.out.println(Arrays.toString(arr2));
	}
}
