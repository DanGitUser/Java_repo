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
			int no = BankUtils.nextInt("1. Sign-Up 2. Login");
			switch(no) {
			case 1:
				customerService.register(); break;
			case 2:
				customerService.login(); break;
			}
		}
		else {
			System.out.println("Login Status");
			int no = BankUtils.nextInt("1. Logout");
			switch(no) {
				case 1:
					customerService.logout(); break;
			}
		}
	}
}
