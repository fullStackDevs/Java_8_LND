package Lesson_12_Traversing_Collections_with_lamda_expr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TraverseCollectWithLamdaExpr {

	public static void main(String[] args) {
		
		List<String> strings = new ArrayList<String>();
		strings.add("AAAAAAA");
		strings.add("BBBBBBB");
		strings.add("CCCCCCC");
		strings.add("DDDDDDD");
		strings.add("EEEEEEE");
		strings.add("FFFFFFF");
		
		//======================================================
		System.out.println("Traversing the collection using an enhanced for loop:");
		for(String str : strings){
			System.out.println(str);
		}
		
		//======================================================		
		System.out.println("Traversing the collection using an iterator:");
		Iterator<String> it = strings.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//======================================================		
		System.out.println("Traversing the collection using a lamda function:");
		strings.forEach(str -> System.out.println(str));
		
		
		
		
		
		
		
	}

}
