package Lesson_13_Filtering_Collection_With_Ppredicate_Interf;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateClass {

	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<Person>();
		
		persons.add(new Person("Joe", 48));
		persons.add(new Person("Marry", 30));
		persons.add(new Person("Mike", 73));
		
		Predicate<Person> predicateOld = new Predicate<Person>(){
			public boolean test(Person pers) {
				return pers.getAge() > 65;			
			}
		};
		
		//Loop through the collection and filter out the ones that don't match the condition
		for(Person pers : persons){
			if(predicateOld.test(pers)){
				System.out.println(pers.toString());
			}
		}
		
		
	}

}
