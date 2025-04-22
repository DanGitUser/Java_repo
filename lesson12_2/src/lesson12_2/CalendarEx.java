package lesson12_2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import static java.util.Calendar.*; //you can remove the Calendar.
import static java.lang.System.*; //you can remove the System.

public class CalendarEx {
	public static void main(String[] args) {
		Calendar call = getInstance();
		Calendar cal1 = getInstance();
		Calendar cal2 = new GregorianCalendar();
//		System.out.println(cal1);
		
		out.println(cal1.get(ERA));
		out.println(cal1.get(YEAR));
		out.println(cal1.get(MONTH));
		out.println(cal1.get(DATE));
		out.println(cal1.get(HOUR));
		out.println(cal1.get(MINUTE));
		out.println(cal1.get(SECOND));
//		cal1.set(0, 0);
	}
}
