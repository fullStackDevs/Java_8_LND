package Lesson_16_Implem_Static_Methods_In_Interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UseStaticMethod {

	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Andrei", 70));
		persons.add(new Person("Maria", 45));
		persons.add(new Person("Ana", 22));
		
		Predicate<Person> predOld = (pers) -> pers.getAge() >= 65;
		
		displayPersons(persons, predOld);
		
	}
	
	public static void displayPersons(List<Person> persons, Predicate<Person> pred){
		persons.forEach(pers ->{
			if(pred.test(pers)){
				String info = PersonInterf.getPersonalInfo(pers);
				System.out.println(info);
			}
		});
	}

}
