package service;

import java.util.ArrayList;
import java.util.List;

import domain.Customer;

import static utils.BankUtils.*;

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

	
	public Customer findById(String id) {
		for (Customer c : customers) {
			if (c.getId().equals(id)) {
				return c;
			}
		}
		return null;
	}
	public Customer findByNo(int no) {
		for (Customer c : customers) {
			if (c.getNo() == no) {
				return c;
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
		String name = nextLine(" Name  : ");
		String tel = nextLine(" Tel No ( ex : 010-0000-0000) :");
		Customer c = findByTel(tel);
		if (c != null) {
			System.err.println("\nNumber already exists.");
			return;
		}
		if (!tel.matches("^01[0-9]{1}-[0-9]{3,4}-[0-9]{4}$")) {
			System.err.println("\nIncorrect Format > ex.(010-0000-0000)");
			return;
		}
		String email = nextLine("E-Mail : ");
		if (!email.matches("^[A-Za-z]{1}[-_.A-Za-z0-9]*@[A-Za-z0-9.-]*\\.[A-Za-z]{2,6}$")) {
			System.err.println("\nIncorrect Format > ex.(Dan-Git.User@Git-123.monster)");
			return;
		}
		String id = nextLine("ID : ");
		c = findById(id);
		if (c != null) {
			System.err.println("\nID already exists.");
			return;
		}
		String pw = nextLine("PW : ");
		int no = customers.isEmpty() ? 1 : customers.get(customers.size() - 1).getNo() + 1;
		customers.add(new Customer(no, name, tel, email, id, pw));
		
	}
	
	
	public void login() {
		String id = nextLine("ID > ");
		String pw = nextLine("PW > ");

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
	
	public void mypage() {
	System.out.println("내정보 보기");
	System.out.println(loginCustomer);
	System.out.println("계좌정보 조회");
	AccountService.getInstance().print(AccountService.getInstance().findAccountsBy(loginCustomer));
}
	
	public void modify() {
//		String name = nextLine("name");
		String tel = nextLine("< Tel No >\n(ex. 10-0000-0000)\nNew Tel. No : ");
		if (!tel.matches("^01[0-9]{1}-\\d{3,4}-\\d{4}$") || (findByTel(tel) != null)) {
			System.err.println("\nIncorrect Format :\n(ex. 010-0000-0000)\nOr Duplicate Number");
			return;
		}
		String email = nextLine("New E-Mail : ");
		if (!email.matches("([A-Za-z]{1}[_-.\\w+])@([_-.\\w+]).([_-.A-Za-z]{2,6})")) {
			System.err.println("\nIncorrect Format :\n(ex. Dan-Git.User@Git-123.monster)");
			return;
		}
		String pw = nextLine("New PW : ");
		String pwCheck = nextLine("Please Input Current Password to Confirm Identity :");
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
		if(!AccountService.getInstance().findAccountsBy(loginCustomer).isEmpty()) {
			System.out.println("계좌가 존제합니다. 해지 후 탈퇴 진행하세요");
			return;
		}
		
		if(nextConfirm("Delete User? (y/n)")) {
			customers.remove(findById(loginCustomer.getId()));
			System.out.println("Deleted Successful");
			logout();		
		}		
	}
}

