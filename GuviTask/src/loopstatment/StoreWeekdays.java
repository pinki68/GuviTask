package exception_collection;

import java.util.Scanner;

public class StoreWeekdays {

	public static void main(String[] args) {
		
		  // Array to store names of weekdays
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scanner = new Scanner(System.in);
     
        
        try {
            // Ask the user for the day position
            System.out.print("Enter the day position (0-6): ");
            int dayPosition = scanner.nextInt();

            // Print the day name
            System.out.println("The day is: " + weekdays[dayPosition]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle array index out of bound exception
            System.err.println("Invalid input! Please enter a number between 0 and 6.");
        } catch (Exception e) {
            // Handle any other exceptions
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
            
	}

}
