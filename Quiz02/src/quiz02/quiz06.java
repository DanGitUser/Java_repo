package quiz02;
//1. Login Authentication
//User inputs ID and PW
//if ID = admin && PW = 1234 = Success
//if ID or PW is wrong = print "Wrong ID / PW"
//if ID !admin = print "Account Doesn't Exist"

import java.util.Scanner;

public class quiz06 {
	public static void main(String[] args) {
		
		String idIs = "Admin";
	    String pwIs = "1234";	

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter ID :");
		String ID = scan.nextLine();
		
		System.out.print("Enter PW :");
		String PW = scan.nextLine();	
		
        switch (ID) {
            case "Admin":
        switch (PW) {
        	case "1234":
        		System.out.print("Login Success!");
        		break;
            default:
            	System.out.print("Wrong ID / PW");
            	break;
        	}
        		break;
            default:
            	System.out.print("Account Doesn't Exist");
            	break;
        }
	}
}