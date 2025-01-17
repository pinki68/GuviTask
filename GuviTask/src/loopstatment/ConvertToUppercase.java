package javaadvancetask5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertToUppercase {

	public static void main(String[] args) {
		  // Create a Stream of Strings
        Stream<String> names = Stream.of("aBc", "d", "ef");

        // Convert the Stream of Strings to uppercase using map()
        List<String> upperCaseNames = names
                .map(String::toUpperCase) // Convert each string to uppercase
                .collect(Collectors.toList()); // Collect the results into a List

        
        System.out.println(upperCaseNames);
	}

}
