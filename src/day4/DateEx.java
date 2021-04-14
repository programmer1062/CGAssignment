package day4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateEx {

	public static void main(String[] args) {
		
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
		String pattern=date.format(formatter);
		System.out.println(pattern);
		
		String date1="12-04-2021";
		DateTimeFormatter dateformat=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate parsedDate=LocalDate.parse(date1, dateformat);
		System.out.println(parsedDate);
		System.out.println(parsedDate.minusDays(1));
	}

}
