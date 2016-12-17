package Lesson_23_TimeZones;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Set;
import java.util.function.Predicate;


public class TimeZones {

	public static void main(String[] args) {
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		LocalDateTime currentDate = LocalDateTime.now();
		System.out.println("Date on the local machine: " + dateTimeFormatter.format(currentDate));
		
		ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT+0"));
		System.out.println("GMT time: " + dateTimeFormatter.format(gmt));
		
		ZonedDateTime ny = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("NY time: " + dateTimeFormatter.format(ny));
		
		
		Set<String> zones = ZoneId.getAvailableZoneIds();
		Predicate<String> londonZoneId = (zoneId) -> zoneId.contains("London"); 		
		
		zones.forEach(zone -> {
			if(londonZoneId.test(zone))
				System.out.println(zone);
		});
		
		ZonedDateTime londonTime = ZonedDateTime.now(ZoneId.of("Europe/London"));
		System.out.println("London time: " +  dateTimeFormatter.format(londonTime));
		
		

	}

}
