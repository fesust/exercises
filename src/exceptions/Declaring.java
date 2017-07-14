package exceptions;

import java.text.ParseException;
import java.lang.Throwable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.lang.Exception;

public class Declaring {

		public static void main(String[] args) throws ParseException {
			SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
			String date = "11-JUL-2017";
			String date2 = "2017.07.11";
			boolean validFormat = dateFormatValidator(format, date);
			System.out.println("Input date is valid: " + validFormat);
			validFormat = dateFormatValidator(format, date2);
			System.out.println("Input date is valid: " + validFormat);
		}
		
		private static boolean dateFormatValidator(SimpleDateFormat format, String input) throws ParseException {
			Date date = format.parse(input);
			if(date != null) return true;
			else return false;
		}
}
