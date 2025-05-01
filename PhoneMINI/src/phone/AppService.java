
package phone;

import static java.util.Calendar.DATE;
import static java.util.Calendar.DAY_OF_WEEK;
import static java.util.Calendar.getInstance;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AppService {
	
	private AppService appServices;
	
	public void calendarApp() {
		Calendar cal = getInstance();
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
	
	public static void displayCurrentTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String currentTime = sdf.format(new Date());
        System.out.println(currentTime);
	}
	
	
}
