package Lesson_14_Traversing_Collections_With_Method_References;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InstanceMethodReference {
	
	public static void main(String[] args){
		InstanceMethodReference instanceMethodReference = new InstanceMethodReference();
		instanceMethodReference.sortData();
	}

	public void sortData(){
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Marian", 78));
		persons.add(new Person("Mihai", 34));
		persons.add(new Person("Cristina", 56));
		
		Collections.sort(persons, this :: compareAges);
		
		persons.forEach(pers -> System.out.println(pers));
		
	}
	
	public int compareAges(Person pers1, Person pers2){
		Integer agePers1 = pers1.getAge();
		return agePers1.compareTo(pers2.getAge());
	}
	
	
}
