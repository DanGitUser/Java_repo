package lesson;

public class MinMAx {
	public static void main(String[] args) {
		int [] arr = {10, 1 , 3, 5, 6};
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			else if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Max :"+max);
		System.out.println("Min :"+min);
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
			System.out.println("Sum of numbers :" +sum);
			System.out.println("Avg of numbers :" +sum / arr.length);	
	}
}
