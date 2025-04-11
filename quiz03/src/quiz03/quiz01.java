package quiz03;

import java.util.Arrays;
import java.util.Scanner;

public class quiz01 {
	public static void main(String[] args) {
		System.out.print("Enter Value of Cash to break :");
		Scanner scan = new Scanner(System.in);
	
		int price = scan.nextInt();
		int[] units = {50000,10000,5000,1000};
		int [] arr = {units[0],units[1],units[2],units[3]};
		int oman = price / units[0];
		int ilman = price % units[0] / units[1];
		int ochun = price % units[1]/ units[2] ;
		int ilchun = price % units[2]  / units[3] ;
		
		System.out.println("Result :");
		System.out.println(units[0] + ": "+oman+"장");
		System.out.println(units[1] + ": "+ilman+"장");
		System.out.println(units[2] + ": "+ochun+"장");
		System.out.println(units[3] + ": "+ilchun+"장");
		
		int[] count = new int[units.length];
		int sum = oman + ilman + ochun + ilchun;
		for (int i = 0; i < 1; i++) {
			sum += units[i];
			System.out.print(units.length);
			
		}
	}
}
