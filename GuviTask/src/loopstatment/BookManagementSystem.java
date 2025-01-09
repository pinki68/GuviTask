package oopsProgramming;

import java.util.Scanner;

public class BookManagementSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Library library = new Library(100); // Library can hold up to 100 books

		while (true) {
			System.out.println("\n--- Library Management System ---");
			System.out.println("1. Add Book");
			System.out.println("2. Remove Book");
			System.out.println("3. Search Book by ID");
			System.out.println("4. Display All Books");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1: // Add Book
				System.out.print("Enter Book ID: ");
				int bookID = scanner.nextInt();
				scanner.nextLine(); // Consume newline
				System.out.print("Enter Title: ");
				String title = scanner.nextLine();
				System.out.print("Enter Author: ");
				String author = scanner.nextLine();
				Book book = new Book(bookID, title, author);
				library.addBook(book);
				break;

			case 2: // Remove Book
				System.out.print("Enter Book ID to remove: ");
				int removeID = scanner.nextInt();
				library.removeBook(removeID);
				break;

			case 3: // Search Book
				System.out.print("Enter Book ID to search: ");
				int searchID = scanner.nextInt();
				library.searchBook(searchID);
				break;

			case 4: // Display All Books
				library.displayBooks();
				break;

			case 5: // Exit
				System.out.println("Exiting Library Management System. Goodbye!");
				scanner.close();
				return;

			default:
				System.out.println("Invalid choice. Please try again.");
			}

		}
	}

}
