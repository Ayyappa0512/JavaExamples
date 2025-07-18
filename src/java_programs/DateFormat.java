package java_programs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//d-date, M-month, y-year H-hours, m-minutes, s-seconds
		
		String date = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
		System.out.println(date);
		
		String date2 = new SimpleDateFormat("dd-MMM-yyyy HH:mm").format(new Date());
		
		System.out.println(date2);
		
		Date d = new Date();
		System.out.println(d);
	}

}
