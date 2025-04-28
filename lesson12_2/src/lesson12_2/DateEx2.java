package lesson12_2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx2 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());
		System.out.println(now.toLocaleString());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss E a");
		System.out.println(sdf.format(now));
	}
}
