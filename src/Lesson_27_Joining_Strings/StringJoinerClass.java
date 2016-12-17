package Lesson_27_Joining_Strings;

import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeSet;

public class StringJoinerClass {

	public static void main(String[] args) {
	
		//Crating a StringJoiner
		StringJoiner names = new StringJoiner(",", "{", "}");
		names.add("Diana")
		.add("Ion")
		.add("Miahi");
		
		System.out.println(names);
		
		//Merging a StringJoiner
		StringJoiner names2 = new StringJoiner(",");
		names2.add("Kristine")
		.add("Ana");
		
		names.merge(names2);
		System.out.println(names);
		
		//Working with collections
		Set<String> states = new TreeSet<String>();
		states.add("California");
		states.add("Arizona");
		states.add("Maine");
		
		StringJoiner statesStringJoiner = new StringJoiner(" and ");
		states.forEach(st -> statesStringJoiner.add(st));
		
		System.out.println(statesStringJoiner);
		
		
		
		
		
	}

}
