package phone;

import phone.User;

import static java.util.Calendar.DATE;
import static java.util.Calendar.DAY_OF_WEEK;
import static java.util.Calendar.getInstance;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import phone.AppService;

public class PhoneService {

	private static PhoneService phoneService = new PhoneService();
	private PhoneService() {}
	public static PhoneService getInstance() {
		return phoneService;
	}
	
	private UserService userService = UserService.getInstance();
	
	public void pwrOff() {
		System.out.println("Powering Off");
		System.exit(0);
	}
	
	
	public void menu() {
		while (true) {			
			if (userService.getLoginUser() == null) {
				displayCurrentTime();
				int no = PhoneUtils.nextInt("1. 폰 켜기 2. 폰 끄기");
				switch (no) {
				case 1:
					pwrOn();
				case 2:
					pwrOff();
					break;
				default:
					System.out.println("Enter 1 ~ 2 only.");
					break;
				}
			}
		}	
	}
	public void pwrOn() {
		int no = PhoneUtils.nextInt("1. Calendar");
		switch(no) {
		case 1:
		}
	}
	
	private static void displayCurrentTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String currentTime = sdf.format(new Date());
        System.out.println("Current Time: " + currentTime);
	}
}
