package javaadvancetask5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculatAge {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

        // prompt the user to enter their birthdate
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String inputDate = scanner.nextLine();

        // parse the input date into a LocalDate object
        LocalDate birthDate = LocalDate.parse(inputDate);

        // get the current date
        LocalDate currentDate = LocalDate.now();

        // calculate the age using the Period class
        Period age = Period.between(birthDate, currentDate);

        // display the result
        System.out.printf("Your age is: %d years, %d months, and %d days.%n",
                age.getYears(), age.getMonths(), age.getDays());
		
	}

}
