package oopsProgramming;

public class Book {

	private int bookID;
	private String title;
	private String author;
	private boolean isAvailable;

	public Book(int bookID, String title, String author) {
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.isAvailable = true;
	}

	// Getters and setters
	public int getBookID() {
		return bookID;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean available) {
		isAvailable = available;
	}

	// Display book details
	public void displayBookInfo() {
		System.out.println("Book ID: " + bookID);
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
		System.out.println("------------------------");
	}

}
