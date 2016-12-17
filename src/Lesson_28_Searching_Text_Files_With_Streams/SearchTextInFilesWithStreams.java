package Lesson_28_Searching_Text_Files_With_Streams;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.stream.Stream;

public class SearchTextInFilesWithStreams {

	public static void main(String[] args) {
		
		Path filePath = FileSystems.getDefault().getPath("files", "hamlet.txt");
		String searchTerm = "To be, or not to be";
		
		try (Stream<String> lines = Files.lines(filePath)){
			Optional<String> line = lines.filter(l -> l.contains(searchTerm)).findFirst();
			if (line.isPresent()) {
				System.out.println("Found: "+ line.get());
			} else {
				System.out.println("Text not found.");
			}
		} catch (Exception e) {
			System.out.println("There was an error: " + e.getMessage());
		}
		
		
		
	}

}
