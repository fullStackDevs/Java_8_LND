package Lesson_19_Aggregated_Stream_Values;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreams {

	public static void main(String[] args) {
		
		List<String> items = new ArrayList<String>();
		for(int i = 0; i < 10000; i++){
			items.add("Item " + i);
		}
		
		long beforeCount = System.currentTimeMillis();
		long nr_items = items.stream()
				//.parallel()
				.count();
		long afterCount = System.currentTimeMillis();
		
		System.out.println("Nr of items in the collection: " + nr_items);
		System.out.println("Nr of milisecond taken to count with parallel streams " + (afterCount - beforeCount));
		
	}

}
