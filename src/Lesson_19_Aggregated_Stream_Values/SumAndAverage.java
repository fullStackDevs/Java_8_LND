package Lesson_19_Aggregated_Stream_Values;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class SumAndAverage {
	public static void main(String[] args){
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Diana", 67));
		persons.add(new Person("Dan", 88));
		persons.add(new Person("Radu", 30));
		
		int sumOfAges = persons.stream()
					.mapToInt(pers -> pers.getAge())
					.sum();
		
		System.out.println("The sum of all ages from the list is: " + sumOfAges);
		
		OptionalDouble average = persons.stream()
										.mapToInt(pers -> pers.getAge())
										.average();
		
		System.out.println("The average age in the list is: " + average.getAsDouble());
		
	}

}
