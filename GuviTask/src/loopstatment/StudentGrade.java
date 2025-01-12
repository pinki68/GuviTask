package exception_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGrade {

	private HashMap<String, Integer> studentGrades;

	// Constructor to initialize the HashMap
	public StudentGrade() {
		studentGrades = new HashMap<>();
	}

	// Method to add a new student
	public void addStudent(String name, int grade) {
		studentGrades.put(name, grade);
		System.out.println("Student added: " + name + " with grade " + grade);
	}

	// Method to remove a student
	public void removeStudent(String name) {
		if (studentGrades.containsKey(name)) {
			studentGrades.remove(name);
			System.out.println("Student removed: " + name);
		} else {
			System.out.println("Student not found: " + name);
		}
	}

	// Method to display a student's grade by name
	public void displayGrade(String name) {
		if (studentGrades.containsKey(name)) {
			System.out.println(name + "'s grade: " + studentGrades.get(name));
		} else {
			System.out.println("Student not found: " + name);
		}
	}

	// Method to display all students and their grades
	public void displayAllStudents() {
		if (studentGrades.isEmpty()) {
			System.out.println("No students in the system");
		} else {
			System.out.println("All Students and Grades:");
			for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}
		}
	}

	public static void main(String[] args) {

		StudentGrade grades = new StudentGrade();
		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\n1. Add Student");
			System.out.println("2. Remove Student");
			System.out.println("3. Display Student Grade");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				System.out.print("Enter student name: ");
				String name = scanner.nextLine();
				System.out.print("Enter student grade: ");
				int grade = scanner.nextInt();
				grades.addStudent(name, grade);
				break;
			case 2:
				System.out.print("Enter student name to remove: ");
				String nameToRemove = scanner.nextLine();
				grades.removeStudent(nameToRemove);
				break;
			case 3:
				System.out.print("Enter student name to display grade: ");
				String nameToDisplay = scanner.nextLine();
				grades.displayGrade(nameToDisplay);
				break;
			case 4:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		} while (choice != 4);

		scanner.close();

	}

}
