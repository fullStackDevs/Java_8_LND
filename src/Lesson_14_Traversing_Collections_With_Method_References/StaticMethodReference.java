package Lesson_14_Traversing_Collections_With_Method_References;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StaticMethodReference {

	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Ion", 68));
		persons.add(new Person("Mihai", 20));
		persons.add(new Person("Ana", 30));
		
		Collections.sort(persons, Person::compareAges);
		
		persons.forEach(pers -> System.out.println(pers));
	}

}
