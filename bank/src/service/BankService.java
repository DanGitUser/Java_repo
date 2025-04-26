package service;

import domain.Customer;
import utils.BankUtils;

public class BankService {
	
	private static BankService bankService = new BankService();
	private BankService() {}
	public static BankService getInstance() {
		return bankService;
	}
	
	private CustomerService customerService = CustomerService.getInstance();
	
	public void menu() {
		if(customerService.getLoginCustomer() == null) {
			int no = BankUtils.nextInt("1. Sign-Up\n2. Login");
			switch(no) {
			case 1:
				customerService.register(); break;
			case 2:
				customerService.login(); break;
			default: System.out.println("Enter 1 ~ 3 only."); break;
			}
			
		}

		else {
			Customer customer = customerService.getLoginCustomer();
			System.out.println("Current User : " + customer.getName());
			int no = BankUtils.nextInt("1. Deposit\n2. Withdraw\n3. Check Balance\n4. Logout");
			switch(no) {
				case 1:
					bankService.deposit(); break;
				case 2:
					bankService.withdraw(); break;
				case 3:
					bankService.checkBalance(); break;
				case 4:
					customerService.logout(); break;
			}
		}	
	}
	public void deposit() {
	    System.out.println(">> Deposit");
	}

	public void withdraw() {
	    System.out.println(">> Withdraw");
	}

	public void checkBalance() {
	    System.out.println(">> Check Balance");
	}
}

//try {
//    // LOGIN or SIGNUP first
//    while (!service.isLoggedIn()) {
//        switch (BankUtils.nextInt("1. Sign Up  2. Login  3. Exit\n-> ")) {
//            case 1: service.register(); break;
//            case 2: service.login(); break;
//            case 3: {
//                System.out.println("Come Again!");
//                return;
//            }
//            default: System.out.println("Enter 1 ~ 3 only."); break;
//        }
//    }
//
//    // MAIN MENU after login
//    while (service.isLoggedIn()) {
//        switch (BankUtils.nextInt("1. Create Account  2. Deposit  3. Withdraw  4. Check Balance  5. Logout\n-> ")) {
//            case 1: service.createAccount(); break;
//            case 2: service.deposit(); break;
//            case 3: service.withdraw(); break;
//            case 4: service.checkBalance(); break;
//            case 5: service.logout(); break;
//            default: System.out.println("Choose between 1 ~ 5.");
//        }
//    }
//
//} catch (NumberFormatException e) {
//    System.out.println("Please enter a valid number.");
//} catch (IllegalArgumentException e) {
//    System.out.println(e.getMessage());
//}
