package exception_collection;

public class StudentManagementSystem {

	public static void main(String[] args) {

		try {
			// Valid student
			Student student1 = new Student(1, "Siya Singh", 18, "Computer Science");
			System.out.println(student1);

			// Invalid age
			Student student2 = new Student(2, "Rohan Gupta", 14, "Mathematics");
			System.out.println(student2);
		} catch (AgeNotWithinRangeException | NameNotValidException e) {
			System.err.println(e.getMessage());
		}

		try {
			// Invalid name
			Student student3 = new Student(3, "John123", 19, "Physics");
			System.out.println(student3);
		} catch (AgeNotWithinRangeException | NameNotValidException e) {
			System.err.println(e.getMessage());

		}
	}

}
