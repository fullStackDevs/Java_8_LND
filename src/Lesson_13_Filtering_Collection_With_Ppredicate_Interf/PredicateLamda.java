package Lesson_13_Filtering_Collection_With_Ppredicate_Interf;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateLamda {

	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Mihai", 70));
		persons.add(new Person("Diana", 23));
		persons.add(new Person("Bogdan", 50));
		
		
		//*** Nu se mai pune si "return" deoarece fiind o singura linie Java isi va da singura seama ca 
		// aceasta este valoarea care trebuie returnata
		Predicate<Person> predOld = (pers) -> pers.getAge() >=65;		
		Predicate<Person> predYoung = (pers) -> pers.getAge() <= 30;
		
		displayPeople(persons, predYoung);
		
	}

	public static void displayPeople(List<Person> persons, Predicate<Person> pred) {
		persons.forEach(pers -> {
			if(pred.test(pers)){
				System.out.println(pers);
			}
		});
	}

}



















