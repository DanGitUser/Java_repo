package lesson;

import java.util.Scanner;

public class lesson05_6 {
	public static void main(String[] args) {
		
		System.out.println("Input Score : ");
		Scanner scan = new Scanner(System.in);
		
		int score = scan.nextInt();
		String grade = "";
		switch(score / 10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		default :
			grade = "F";
		}
		System.out.println(grade);	
	}
}
