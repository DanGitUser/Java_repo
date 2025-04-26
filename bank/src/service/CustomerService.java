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
	int count = 1;
	{
		customers.add(new Customer(count++, "새똥이", "010-1111-2222", "ssa@gmail.com", "ssa", "1234"));
	}
	
	public Customer findById(String id) {
		for (Customer s : customers) {
			if (s.getId().equals(id)) {
				return s;
			}
		}
		return null;
	}
	
	public Customer findByTel(String tel) {
		for (Customer s : customers) {
			if (s.getTel().equals(tel)) {
				return s;
			}
		}
		return null;
	}
	
	public void register() {
		System.out.println("Register");
		String name = BankUtils.nextLine("< Name > : ");
		String tel = BankUtils.nextLine("< Tel No > ex.(010-0000-0000) :");
		Customer c = findByTel(tel);
		if (c != null) {
			System.err.println("\nNumber already exists.");
			return;
		}
		if (!tel.matches("^01[0-9]{1}-[0-9]{3,4}-[0-9]{4}$")) {
			System.err.println("\nIncorrect Format > ex.(010-0000-0000)");
			return;
		}
		String email = BankUtils.nextLine("E-Mail : ");
		if (!email.matches("^[A-Za-z]{1}[-_.A-Za-z0-9]*@[A-Za-z0-9.-]*\\.[A-Za-z]{2,6}$")) {
			System.err.println("\nIncorrect Format > ex.(Dan-Git.User@Git-123.monster)");
			return;
		}
		String id = BankUtils.nextLine("ID : ");
		c = findById(id);
		if (c != null) {
			System.err.println("\nID already exists.");
			return;
		}
		String pw = BankUtils.nextLine("PW : ");
		customers.add(new Customer(count++, name, tel, email, id, pw));
		
	}
	
	
	public void login() {
		String id = BankUtils.nextLine("ID > ");
		String pw = BankUtils.nextLine("PW > ");

		for (Customer c : customers) {
			if (c.getId().equals(id) && c.getPw().equals(pw)) {
				loginCustomer = c;
				System.out.println("Login Success");
				return;
			}
		}
		System.err.println("\nID or PW is Incorrect");
	}

	public Customer getLoginCustomer() {
		return loginCustomer;
	}
	
	public void info() {
		System.out.println(loginCustomer.toString());
	}
	
	public void modify() {
		String tel = BankUtils.nextLine("< Tel No >\n(ex. 10-0000-0000)\nNew Tel. No : ");
		if (!tel.matches("^01[0-9]{1}-\\d{3,4}-\\d{4}$") || (findByTel(tel) != null)) {
			System.err.println("\nIncorrect Format :\n(ex. 010-0000-0000)\nOr Duplicate Number");
			return;
		}
		String email = BankUtils.nextLine("New E-Mail : ");
		if (!email.matches("([A-Za-z]{1}[_-.\\w+])@([_-.\\w+]).([_-.A-Za-z]{2,6})")) {
			System.err.println("\nIncorrect Format :\n(ex. Dan-Git.User@Git-123.monster)");
			return;
		}
		String pw = BankUtils.nextLine("New PW : ");
		String pwCheck = BankUtils.nextLine("Please Input Current Password to Confirm Identity :");
		if (!pwCheck.equals(loginCustomer.getPw())) {
			System.err.println("\nPassword Incorrect");
			return;
		}
		loginCustomer.setTel(tel);
		loginCustomer.setEmail(email);
		loginCustomer.setPw(pw);
		System.out.println("User Modification Success");
	}
	
	public void logout() {
		loginCustomer = null;
		System.out.println("Logout Success");
	}
	
	public void remove() {
		Customer c = findById(loginCustomer.getId());
		if(BankUtils.nextConfirm("Delete User? (y/n)")) {
			customers.remove(c);
			System.out.println("Deleted Successful");
			loginCustomer = null;		
		}		
	}
}

