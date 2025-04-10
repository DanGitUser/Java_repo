package quiz02;

import java.util.Scanner;

public class quiz02 {
	public static void main(String[] args) {
		System.out.print("Input age :");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		System.out.print("Input height (cm) :");
		int height= scan.nextInt();

		boolean parent = true , heartdis = false;
		
		boolean isRide = !heartdis && height >= 120 && (age >= 6 || parent);
		System.out.println("Can Ride ඞ:"+isRide);
		
	}	
}