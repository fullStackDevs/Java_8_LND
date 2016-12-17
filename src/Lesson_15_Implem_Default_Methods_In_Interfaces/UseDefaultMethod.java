package Lesson_15_Implem_Default_Methods_In_Interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UseDefaultMethod {

	public static void main(String[] args){
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Dina", 45));
		persons.add(new Person("Ivan", 78));
		persons.add(new Person("Mariana", 21));
		
		Predicate<Person> predOld = (pers) -> pers.getAge() >= 65;
		
		displayPeople(persons, predOld);
		
	}
	
	public static void displayPeople(List<Person> persons, Predicate<Person> perd){
		persons.forEach(pers -> {
			if(perd.test(pers)){
				//String p = pers.getName() + "(" + pers.getAge() + ")";
				System.out.println(pers.getPersonInfo());
			}
		});
	}
	
}
