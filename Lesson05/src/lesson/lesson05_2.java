package lesson;

import java.util.Scanner;

public class lesson05_2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input Math test score : ");
		int score = scanner.nextInt();
		String grade = "";
		System.out.println("Grading Initiated . . .");
		if (score >= 95) {
			grade = "A+";
		}
		else if (score >= 90) {
			grade = "A";
		}
		else if (score >= 85) {
			grade = "B+";
		}
		else if (score >= 80) {
			grade = "B";
		}
		else if (score >= 75) {
			grade = "C+";
		}
		else if (score >= 70) {
			grade = "C";
		}
		else if (score >= 65) {
			grade = "D+";
		}
		else if (score >= 60) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		System.out.println("You got a "+grade+"!");
		
		System.out.println("Input Eng test score : ");
		int engscore = scanner.nextInt();
		System.out.println("Grading Initiated . . .");
		if (engscore >= 95) {
			grade = "A+";
		}
		else if (engscore >= 90) {
			grade = "A";
		}
		else if (engscore >= 85) {
			grade = "B+";
		}
		else if (engscore >= 80) {
			grade = "B";
		}
		else if (engscore >= 75) {
			grade = "C+";
		}
		else if (engscore >= 70) {
			grade = "C";
		}
		else if (engscore >= 65) {
			grade = "D+";
		}
		else if (engscore >= 60) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		System.out.println("You got a "+grade+"!");
		
		
		System.out.println("Grading Over");
	}
}
