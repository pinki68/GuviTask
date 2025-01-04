package oopstask1;

public class Person {

		// Properties
		private String name;
		private int age;

		// default constructor with default age of 18
		public Person() {
			this.age = 18;
		}

		// constructor to initialize name and age
		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		// method to display name and age
		public void display() {
			System.out.println("Name: " + name);
			System.out.println("Age : " + age);
		}

		// main method to test the Person class
		public static void main(String[] args) {
			// create a person object with default age
			Person p1 = new Person();
			p1.display();

			// creating a person object with specified name and age
			Person p2 = new Person("Rohan", 26);
			p2.display();
	}

}
