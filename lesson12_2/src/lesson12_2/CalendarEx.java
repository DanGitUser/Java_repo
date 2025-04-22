package lesson12_2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import static java.util.Calendar.*; //you can remove the Calendar.

import java.text.SimpleDateFormat;

import static java.lang.System.*; //you can remove the System.

public class CalendarEx {
	public static void main(String[] args) {
		Calendar call = getInstance();
		Calendar cal1 = getInstance();
		Calendar cal2 = new GregorianCalendar();
//		System.out.println(cal1);
		Scanner scanner = new Scanner(in);
//		
//		cal1.set(YEAR, 2);
//		cal1.set(ERA, 0);
		
		out.println(cal1.get(ERA));
		out.println(cal1.get(YEAR));
		out.println(cal1.get(MONTH));
		out.println(cal1.get(DATE));
		out.println(cal1.get(HOUR));
		out.println(cal1.get(MINUTE));
		out.println(cal1.get(SECOND));
		out.println(cal1.get(DAY_OF_WEEK));
		
//		cal1.set(MONTH, 4);
		System.out.println(cal1.getActualMaximum(DATE));
		
		cal1.roll(MONTH, -10);
		printCal(cal1);
	}
	
	static void printCal(Calendar cal) {
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(cal.getTime()));
	}
}
