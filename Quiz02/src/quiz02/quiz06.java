package quiz02;
//1. Login Authentication
//User inputs ID and PW
//if ID = admin && PW = 1234 = Success
//if ID or PW is wrong = print "Wrong ID / PW"
//if ID !admin = print "Account Doesn't Exist"

import java.util.Scanner;

public class quiz06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String idIs = "Admin";
	    String pwIs = "1234";	
		
		System.out.print("Enter ID :");
		String id = scan.nextLine();
		System.out.println("ID is :" + id);
		
		System.out.print("Enter PW :");
		String pw = scan.nextLine();	
		System.out.println("PW is :" + pw);

		if(!id.equals("Admin")) {
			System.out.print("Account Doesn't Exist");
		}
		else if(pw.equals("1234")) {
			System.out.print("Login Success!");
		}
		else {
			System.out.print("Wrong ID / PW");
		}	    
	}
}

/*
switch (id) {
    case "Admin":
    switch (pw) {
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
 */