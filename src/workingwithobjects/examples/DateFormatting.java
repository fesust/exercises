package workingwithobjects.examples;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatting {

	public static void main(String[] args) {
		
		DateFormat df = new SimpleDateFormat("yyyy");
		String formattedDate = df.format(new Date());
		System.out.println(formattedDate);
		
		Calendar cal = Calendar.getInstance();
		cal.getTime();
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.printf("Today is the %d" + ". day of the week.", dayOfWeek);
		System.out.println("\nThe year is: " + cal.get(Calendar.YEAR));
		
	}
}
