package javaadvancetask5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SpecialGift {

	public static void main(String[] args) {

		// List of student names
		List<String> students = Arrays.asList("Amar", "Rohan", "Anand", "Siya", "Arjun", "Dolly", "Somu");

		// Filter students whose names start with "A" using stream API and lambda
		// expression
		List<String> specialGiftStudents = students.stream().filter(name -> name.startsWith("A")) // Filter names
																									// starting with "A"
				.collect(Collectors.toList()); // Collect the filtered names into a List

		// Print the students who will receive special gifts
		System.out.println("Students receiving special gifts: " + specialGiftStudents);
	}

}
