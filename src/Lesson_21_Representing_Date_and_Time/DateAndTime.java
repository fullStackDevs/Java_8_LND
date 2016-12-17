package Lesson_21_Representing_Date_and_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAndTime {

	public static void main(String[] args) {
		
		LocalDate currentDate = LocalDate.now();
		System.out.println("Current date: " + currentDate);
		
		LocalDate specificDate = LocalDate.of(2016, 11, 24);
		System.out.println("Specific date: " + specificDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current Time: " + currentTime);
		
		LocalTime specificTime = LocalTime.of(15, 30, 1);
		System.out.println("Specific time: " + specificTime);
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("Current DateTime: " + currentDateTime);
		
		LocalDateTime specificDateTime = LocalDateTime.of(specificDate, specificTime);
		System.out.println("Specific DateTime: " + specificDateTime);
		
		
	}

}
