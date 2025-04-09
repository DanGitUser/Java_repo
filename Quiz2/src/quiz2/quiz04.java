package quiz2;

import java.util.Scanner;
// MONEY BREAKER 9000
public class quiz04 {
	public static void main(String[] args) {
		System.out.print("Enter Value of Cash to break :");
		Scanner scan = new Scanner(System.in);
		int price = scan.nextInt();
		int oman = ((price /10000) * 10000) / 50000;
		int ilman = (((price / 10000) * 10000) - (oman * 50000)) / 10000;
		int ochun = (price - ((oman * 50000) + ilman * 10000)) / 5000;
		int ilchun = (price - (((oman * 50000) + ilman * 10000) + ochun * 5000)) / 1000;
		System.out.println("Result :");
		System.out.println("5 만 : "+oman+"장");
		System.out.println("1 만 : "+ilman+"장");
		System.out.println("5 천 : "+ochun+"장");
		System.out.println("1 천 : "+ilchun+"장");
		
	}
}
