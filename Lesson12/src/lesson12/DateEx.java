package lesson12;

import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		//Today
		Date today = new Date(102, 11, 23);		
		//Date of sign
		Date endDate = new Date(125, 3, 21);
		
		System.out.println(endDate.getTime() - today.getTime());
		
		long duration = endDate.getTime() - today.getTime();
		System.out.println(duration / 1000 / 60 / 60 / 24);
		
		
	}
}
