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
			int no = BankUtils.nextInt("1. Customer Info\n2. Modify User Info\n3. Delete User\n7. Logout");
			switch(no) {
				case 1:
					customerService.info(); break;
				case 2:
					customerService.modify(); break;
				case 3:
					customerService.remove(); break;
//					bankService.deposit(); break;
//				case 3:
//					bankService.withdraw(); break;
//				case 4:
//					bankService.checkBalance(); break;
				case 7:
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
