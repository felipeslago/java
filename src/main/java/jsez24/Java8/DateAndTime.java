package jsez24.Java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

	public static void main(String[] args) {
		
		// Java 8 brings a new library to manipulate dates
		// The LocalDate class helps to create dates
		
		LocalDate today = LocalDate.now(); // The method now returns the current date
		System.out.println(today);
		
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 1); // The method of returns a new date based on the arguments passed: year, month and day
		System.out.println(date);
		
		int years = date.getYear() - today.getYear(); // The method getYear returns the year of the date and it is possible to calculate the difference between another date
		System.out.println(years);
		
		// But the Period class helps to calculate the difference between dates
		
		Period period = Period.between(today, date);
		System.out.println(period); // It returns a string like P3Y6M4D where P is Period, Y is year, M is month and D is day, and the numbers in front indicates its values
		System.out.println(period.getYears() + " years");
		System.out.println(period.getMonths() + " months"); // It has many methods that return specific informations
		System.out.println(period.getDays() + " days"); 
		
		// The methods minusYears/minusMonths/minusDays decreases the date
		
		System.out.println(today.minusYears(1));
		System.out.println(today.minusMonths(1));
		System.out.println(today.minusDays(1));
		
		// And the methods plusYears/plusMonths/plusDays increases the date
		
		System.out.println(today.plusYears(1));
		System.out.println(today.plusMonths(1));
		System.out.println(today.plusDays(1));
		
		// The date object are immutable, so it is necessary to assign its new value
		
		LocalDate nextYear = today.plusYears(1);
		System.out.println(nextYear);
		
		// The DataTimeFormatter class helps to format date from a given pattern
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formattedDate = nextYear.format(f);
		System.out.println(formattedDate);
		
		// The LocalDateTime class helps to work with full date format
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		// And it is possible to format it using the DateTimeFormatter
		
		DateTimeFormatter h = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		String formattedDateTime = now.format(h);
		System.out.println(formattedDateTime);
		
		// The YearMonth class helps work with a Year-Month date
		
		YearMonth ym = YearMonth.of(2016, Month.JANUARY);
		System.out.println(ym);
		
		// The LocalTime class helps work with time in hours, minutes, seconds and milliseconds
		
		LocalTime time = LocalTime.of(12, 30, 30, 30);
		System.out.println(time);
	}
}