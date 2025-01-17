package javaadvancetask5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonEmptyyString {

	public static void main(String[] args) {
		// initialize list of strings
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

		// filter non-empty strings using stream API
		List<String> nonEmptyStrings = strings.stream().filter(s -> !s.isEmpty()) // Check if the string is not empty
				.collect(Collectors.toList()); // Collect the results into a List

		// print the resulting list of non-empty strings
		System.out.println(nonEmptyStrings);
	}

}
