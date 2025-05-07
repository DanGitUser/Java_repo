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
	private  AccountService accountService = AccountService.getInstance();
	
	public void exit() {
		System.out.println("Thank you for using our services.");
		System.exit(0);
	}
	
	public void menu() {
		if(customerService.getLoginCustomer() == null) {
			int no = BankUtils.nextInt("1. Sign-Up\n2. Login\n3. Exit");
			switch(no) {
			case 1:
				customerService.register(); break;
			case 2:
				customerService.login(); break;
			case 3:
				exit(); break;
			default: System.out.println("Enter 1 ~ 3 only."); break;
			}
			
		}

		else {
			Customer customer = customerService.getLoginCustomer();
			System.out.println("Current User : " + customer.getName());
			int no = BankUtils.nextInt(""
					+ "1. Customer Info\n2. Modify User Info\n3. Delete User\n"
					+ "4. Open Account\n5. Deposit\n6. Withdraw\n7. Transfer\n"
					+ "8. Close Account\n9. Logout");
			switch(no) {
				case 1:
					customerService.info(); break;
				case 2:
					customerService.modify(); break;
				case 3:
					customerService.remove(); break;
				case 4:
					accountService.open(); break;
				case 5:
					accountService.deposit(); break;
				case 6:
					accountService.withdraw(); break;
				case 7:
					accountService.transfer(); break;
				case 8:
					accountService.close(); break;
				case 9:
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
