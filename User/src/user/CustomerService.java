package user;

import java.util.List;

public class CustomerService {
//	List<Customer> customers = new ArrayList<Customer>();
	UserService service = new UserService();
	void register() {
		Customer customer = new Customer("3", "JILL", "3");
		service.register(customer);
	}
	
	Customer findBy(String id) {
		return service.findBy(id, Customer.class);
	}
	
	List<Customer> customers() {
		return service.getUsers(Customer.class);
	}
	
	public static void main(String[] args) {
		CustomerService service = new CustomerService();
		service.register();
		System.out.println(service.findBy("1"));
		System.out.println(service.findBy("2"));
		System.out.println(service.findBy("3"));
	}
}
