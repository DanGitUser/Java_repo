package lesson;


import java.util.Scanner;

public class lesson05_01 {
	public static void main(String[] args) {
		// Console Input is hard
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input test score : ");
		int score = scanner.nextInt();
		System.out.println("Test Start");
		if (score >= 60) {
			System.out.println("You Passed");
		}
		else
			System.out.println("Failed");
		System.out.println("End of Test");
	}
}
