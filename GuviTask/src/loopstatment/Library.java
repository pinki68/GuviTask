package oopsProgramming;

public class Library {

	private Book[] books; // Array to store books
	private int count; // Current number of books

	// Constructor
	public Library(int capacity) {
		books = new Book[capacity];
		count = 0;
	}

	// Add a book
	public void addBook(Book book) {
		if (count < books.length) {
			books[count++] = book;
			System.out.println("Book added successfully!");
		} else {
			System.out.println("Library is full. Cannot add more books.");
		}
	}

	// Remove a book by ID
	public void removeBook(int bookID) {
		boolean found = false;
		for (int i = 0; i < count; i++) {
			if (books[i].getBookID() == bookID) {
				found = true;
				System.out.println("Book with ID " + bookID + " removed.");
				// Shift remaining books
				for (int j = i; j < count - 1; j++) {
					books[j] = books[j + 1];
				}
				books[--count] = null; // Clear last book
				break;
			}
		}
		if (!found) {
			System.out.println("Book with ID " + bookID + " not found.");
		}
	}

	// Search for a book by ID
	public void searchBook(int bookID) {
		for (int i = 0; i < count; i++) {
			if (books[i].getBookID() == bookID) {
				System.out.println("Book found:");
				books[i].displayBookInfo();
				return;
			}
		}
		System.out.println("Book with ID " + bookID + " not found.");
	}

	// Display all books
	public void displayBooks() {
		if (count == 0) {
			System.out.println("No books available in the library.");
			return;
		}
		System.out.println("Books in the library:");
		for (int i = 0; i < count; i++) {
			books[i].displayBookInfo();
		}
	}

}
