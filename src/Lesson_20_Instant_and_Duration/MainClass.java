package Lesson_20_Instant_and_Duration;

import java.time.Duration;
import java.time.Instant;

public class MainClass {

	public static void main(String[] args) {
		
		Instant beginTime = Instant.now();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(beginTime);

		Instant endTime = Instant.now();
		System.out.println(endTime);
		
		Duration elapsed = Duration.between(beginTime, endTime);
		System.out.println("Time elapsed: " + elapsed.toMillis());
	}

}
