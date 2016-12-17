package Lesson_22_Format_Date_And_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class DateFormatterEx {

	public static void main(String[] args) {
		
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter df = DateTimeFormatter.ISO_DATE;
		System.out.println("Current date formated defaoult: " + df.format(currentDate));
		
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter tf = DateTimeFormatter.ISO_TIME;
		System.out.println("Current time formated default: " + tf.format(currentTime));
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
		System.out.println("Current date time formatted default: " + dateTimeFormatter.format(currentDateTime));		
		
		DateTimeFormatter f_long = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println(f_long.format(currentDateTime));		
		
		DateTimeFormatter f_short = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(f_short.format(currentDateTime));
		
		String longDateWithLocal = f_long.withLocale(Locale.FRANCE).format(currentDateTime);
		System.out.println("Long date using France locale: " + longDateWithLocal);
		
		String shortDateWithLocale = f_short.withLocale(Locale.FRANCE).format(currentDateTime);
		System.out.println("Short date with locale: " + shortDateWithLocale);
		
		//DatTimeFormatterBuilder
		
		DateTimeFormatterBuilder dtfb = new DateTimeFormatterBuilder()
				.appendValue(ChronoField.MONTH_OF_YEAR)
				.appendLiteral("||")
				.appendValue(ChronoField.DAY_OF_MONTH)
				.appendLiteral("||")
				.appendValue(ChronoField.YEAR);
		
		DateTimeFormatter customDateFormatter = dtfb.toFormatter();
		System.out.println("Date fromatted with the custom dateTimeFormatter: " + customDateFormatter.format(currentDate));
		
		
		
	}

}
