package quiz02;

import java.util.Scanner;

public class quiz05 {
	public static void main(String[] args) {
		System.out.print("Enter Numbers to cull it's 1st and 10th digit :");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int result = number - number % 100;
		System.out.println(result);
				
	}
}