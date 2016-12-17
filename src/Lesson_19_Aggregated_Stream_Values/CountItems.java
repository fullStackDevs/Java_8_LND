package Lesson_19_Aggregated_Stream_Values;

import java.util.ArrayList;
import java.util.List;

class CountItems {

	public static void main(String[] args) {
		
		List<String> items = new ArrayList<String>();
		for(int i = 0 ; i < 10000; i++){
			items.add("Item " + i);
		}
		
		items.stream()
			.forEach(item -> System.out.println(item));
		
		//**##** folosim functia count() din stream
		long nr_items = items.stream().parallel().count();
		System.out.println("No of items in the list: " + nr_items);

	}

}
