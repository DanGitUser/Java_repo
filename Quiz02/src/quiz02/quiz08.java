package quiz02;

import java.util.Scanner;

public class quiz08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Number :");
		int input = scan.nextInt();
		int result;
		boolean 삼의배수 = input % 3 ==0;
		boolean 짝수 = input % 2 == 0;
		
		if (삼의배수 && 짝수) {
			System.out.println("삼의배수 & 짝수");
		}
		else if (삼의배수){
			System.out.println("삼의배수");
		}
		else if (짝수) {
			System.out.println("짝수");
		}
		else {
			System.out.println("nothing");
		}
		
		//bit mask flag
		result = 0;
		result += 삼의배수 ? 1 : 0;
		result += 짝수 ? 2 : 0;
		String str = "";
		switch(result) {
		case 1:
			str += "3의 배수";
		case 2:
			str += "짝수";
		case 3:
			str += "3의 배수 & 짝수";
			
		}
		
		
	}
}
