package java_programs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String date = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
		System.out.println(date);
		
		Date d = new Date();
		System.out.println(d);
	}

}
