package service;

import java.util.ArrayList;
import java.util.List;

import domain.Customer;
import utils.BankUtils;

public class CustomerService {
	private List<Customer> customers = new ArrayList<Customer>();
	private Customer loginCustomer;
	
	public void setLoginCustomer(Customer loginCustomer) {
		this.loginCustomer = loginCustomer;
	}
	private static CustomerService customerService = new CustomerService();
	private CustomerService() {}
	public static CustomerService getInstance() {
		return customerService;
	}
	
	{
		customers.add(new Customer(1, "새똥이", "010-1111-2222", "ssa@gmail.com", "ssa", "1234"));
	}
	
	
	public void register() {
		System.out.println("Register");
	}
	
	public void login() {
		String id = BankUtils.nextLine("ID > ");
		String pw = BankUtils.nextLine("PW > ");
		
		boolean flag = false;
		for(Customer c : customers) {
			if (c.getId().equals(id) && c.getPw().equals(pw)) {
				flag = true;
				loginCustomer = c;
				System.out.println("Login Success");
				break;
			}
		}
		if(!flag) {
			System.out.println("ID or PW is Wrong");
		}
	}
	
	public Customer getLoginCustomer() {
		return loginCustomer;
	}
	
	public void logout() {
		loginCustomer = null;
		System.out.println("Logout Success");
	}
}

