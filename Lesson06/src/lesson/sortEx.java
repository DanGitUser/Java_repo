package lesson;

import java.util.Arrays;

public class sortEx {
	public static void main(String[] args) {
		//정렬
		//버블 정렬
		//1st run
		//{3,4,1,5,2}
		//{3,4,1,5,2}
		//{3,1,4,5,2}
		//{3,1,4,2,5}
		
		//2nd run
		//{1,3,4,2,5}
		//{1,3,4,2,5}
		//{1,3,2,4,5}
		
		//3rd run
		//{1,3,2,4,5}
		//{1,2,3,4,5}
		
		//4th run
		//{1,2,3,4,5}
		int[] units = {50000,10000,5000,1000};
		for(int i = 0 ; i < units.length -1 ; i++) {
			System.out.println("run number " + (i + 1));
			for(int j = 0 ; j < units.length -1 -i ; j++) {
				if(units[j] > units[j+1]) {
					int tmp = units[j];
					units[j] = units[j+1];
					units[j+1] = tmp;
				}
				System.out.println(Arrays.toString(units));
			}
		}
		int[] arr = {5,4,3,2,1};
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
	}
}
