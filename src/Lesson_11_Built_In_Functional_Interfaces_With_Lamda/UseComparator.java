package Lesson_11_Built_In_Functional_Interfaces_With_Lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UseComparator {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();
		strings.add("AAAAA");
		strings.add("bbbbb");
		strings.add("ccccc");
		strings.add("DDDDDDD");
		strings.add("EEEEEEE");
		strings.add("fffffff");
		
		Collections.sort(strings);
		System.out.println("Strings ordered using natural order of the strings: ");
		for(String str : strings){
			System.out.println(str);
		}
		
		//==========================================================================
		//Sorting the collection using a Comparator
				
//		Collections.sort(strings, new Comparator<String>(){
//			public int compare(String elem1, String elem2){
//				return elem1.compareToIgnoreCase(elem2);
//			}
//		});
		
		Comparator<String> comp = (v1, v2) -> {
			return v1.compareToIgnoreCase(v2);
		};
		
		Collections.sort(strings, comp);
		
		System.out.println("Strings ordered with a comparator that ignores cases: ");
		for(String str : strings){
			System.out.println(str);
		}
		

	}

}
