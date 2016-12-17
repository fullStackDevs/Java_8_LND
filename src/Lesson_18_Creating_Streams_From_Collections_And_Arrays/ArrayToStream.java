package Lesson_18_Creating_Streams_From_Collections_And_Arrays;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ArrayToStream {

	public static void main(String[] args) {
		Person[] persons = new Person[3];
		persons[0] = new Person("Marian", 98);
		persons[1] = new Person("Ana", 23);
		persons[2] = new Person("Vantian", 45);
		
		Predicate<Person> predOld = (pers) -> pers.getAge() >= 65;
		
		//**##** Version 1 to convert an Array to a stream:
//		Arrays.stream(persons)
//			.filter(predOld)
//			.forEach(pers -> pers.display());
//		
		
		//**##** Version 2 to convert an Array to a stream:
		Stream<Person> stream = Stream.of(persons);
		stream.filter(predOld)
			.forEach(pers -> pers.display());
		
		
			
	}

}
