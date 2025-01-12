package exception_collection;

public class Student {

	private int rollNo;
	private String name;
	private int age;
	private String course;

	// Getters for student details
	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCourse() {
		return course;
	}

	// Constructor to initialize the student details
	public Student(int rollNo, String name, int age, String course)
			throws AgeNotWithinRangeException, NameNotValidException {

		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.course = course;

		if (age < 15 || age > 21) {
			throw new AgeNotWithinRangeException("Age must be between 15 and 21.");
		}

		if (!name.matches("[a-zA-Z ]+")) {
			throw new NameNotValidException("Name must only contain alphabets and spaces.");
		}

	}

	@Override
	public String toString() {
		return "Student [Roll No=" + rollNo + ", Name=" + name + ", Age=" + age + ", Course=" + course + "]";
	}

}
