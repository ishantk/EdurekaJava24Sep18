package co.edureka.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UtilDemo {

	public static void main(String[] args) {
		
		// System date time
		Date date = new Date(); 
		System.out.println("date is: "+date); // we are printing the ref variable !!
		// toString method in Date class is overrided
		
		SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy | hh:mm");
		String dateTime1 = format1.format(date);
		System.out.println("dateTime1 is: "+dateTime1);

		
		Calendar calendar = Calendar.getInstance();
		int hh = calendar.get(Calendar.HOUR);
		int mi = calendar.get(Calendar.MINUTE);
		
		int dd = calendar.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(dd);
		
		System.out.println(hh+" : "+mi);
		
	}

}
