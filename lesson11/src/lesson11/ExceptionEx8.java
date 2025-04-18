package lesson11;

import java.util.Scanner;

public class ExceptionEx8 {
	static String userId = "seo";
	static String userPw = "smg1234";
	public static void main(String[] args) throws Exception{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("ID : ");
		String inputId = scanner.nextLine();
		
		System.out.println("PW : ");
		String inputPw = scanner.nextLine();
		
		if(!userId.equals(inputId)) {
			throw new LoginException("ID is wrong");
		}
		else if(!userPw.equals(inputPw)) {
			throw new LoginException("PW is wrong");
		}
		else {
			System.out.println("Login Success");
		}
	}
}
