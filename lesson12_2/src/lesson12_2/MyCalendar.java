package lesson12_2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static java.util.Calendar.*;

import java.text.SimpleDateFormat;

public class MyCalendar {
	public static void main(String[] args) {
		//숫자 >> 무자열 : format
		//문자열 >> 숫자 : parse

		//날자 >> 무자열 : format
		//문자열 >> 날자 : parse
//		double d = 1e-3;
		
		Calendar cal = getInstance();
//		cal.set(DATE, 1);
//		cal.add(MONTH, - 1);
		int lastDate = cal.getActualMaximum(DATE);
		int startDay = cal.get(DAY_OF_WEEK);
		int d = startDay - 1;
		System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(cal.getTime()));
		for (int i = 1 - d; i <= lastDate; i++) {
			if(i < 1 ) {
				System.out.printf("%3c", ' ');
			}
			else {
				System.out.printf("%3d", i);
			}
			if(i % 7 == ((7 - d) % 7)) {
				System.out.println();
			}
		}
	}
}
