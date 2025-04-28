package phone;

import java.util.ArrayList;
import java.util.List;

public class UserService {
	private List<User> users = new ArrayList<User>();
	private User loginUser;
	
	public void setLoginUser(User loginUser) {
		this.loginUser = loginUser;
	}
	private static UserService userService = new UserService();
	private UserService() {}
	public static UserService getInstance() {
		return userService;
	}
	
	public User getLoginUser() {
		return loginUser;
	}
}

