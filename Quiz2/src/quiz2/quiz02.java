package quiz2;

import java.util.Scanner;

public class quiz02 {
	public static void main(String[] args) {
		System.out.print("Input age :");
		Scanner scan1 = new Scanner(System.in);
		int age = scan1.nextInt();
		System.out.print("Input height (cm) :");
		Scanner scan2 = new Scanner(System.in);
		int height= scan2.nextInt();
		
		if (!(age >= 6 || height >= 120)) {
		System.out.println("You cannot ride");
		}
		else {
		System.out.println("You can ride");
		}
	}	
}
