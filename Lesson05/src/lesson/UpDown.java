package lesson;

import java.util.Scanner;

public class UpDown {
	public static void main(String[] args) {
		//Random number from (1~100)
		int value = (int)(Math.random() * 100 + 1);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 100");
		int input = 0;
		int count = 0;
		do {
			input = scanner.nextInt();
			if(value < input) {
				System.out.println("Down!");
			}
			else if(value > input) {
				System.out.println("Up!");
			}
			count++;
		}
		while(value!=input);
		
		System.out.println("Got it on try number : "+count+"!");
	}
}
