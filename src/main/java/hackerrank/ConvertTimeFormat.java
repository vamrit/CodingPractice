package hackerrank;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertTimeFormat {
	
/*	Given a time in -hour AM/PM format, convert it to military (24-hour) time.

	Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
	- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

	Example
	s = "12:01:00 PM" -> Return '12:01:00'.
	s = "12:01:00 AM" -> Return '00:01:00'. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(timeConversion("12:01:00 PM"));
		System.out.println(timeConversion("12:01:00 AM"));
	}
	
	public static String timeConversion(String s) {
		String response = "";
		DateFormat inputFormat = new SimpleDateFormat("hh:mm:ss aa");
		DateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
		try {
			Date date = inputFormat.parse(s);
			response = outputFormat.format(date);
		} catch (Exception e) {
			return "Input not in valid format";
		}
		return response;
	}

}
