package Lesson_17_Traversing_Collections_With_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SequentialStream {

	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Gigel", 89));
		persons.add(new Person("Dorel", 23));
		persons.add(new Person("Andrei", 55));
		
		Predicate<Person> predOld = (pers) -> pers.getAge() >= 65;
		showInfo(persons, predOld);
		
	}

	public static void showInfo(List<Person> persons, Predicate<Person> pred){
//		persons.forEach(pers ->{
//			if(pred.test(pers)){
//				System.out.println(pers);
//			}
//		});
		
		persons.stream()
			.filter(pred)
			.forEach(pers -> System.out.println(pers));
	}
}
