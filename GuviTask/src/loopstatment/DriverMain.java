package oopsProgramming;

import java.util.Scanner;

public class DriverMain {

	public static void main(String[] args) {
		
		  Scanner scanner = new Scanner(System.in);

	        // Accept employee information
	        System.out.println("Enter Employee Information:");
	        System.out.print("Employee ID: ");
	        int empId = scanner.nextInt();
	        scanner.nextLine(); // Consume newline
	        System.out.print("Employee Name: ");
	        String empName = scanner.nextLine();
	        System.out.print("Employee Salary: ");
	        double empSalary = scanner.nextDouble();

	        Employee employee = new Employee(empId, empName, empSalary);

	        // Accept product information
	        System.out.println("\nEnter Product Information:");
	        scanner.nextLine(); // Consume newline
	        System.out.print("Product Id: ");
	        int pid = scanner.nextInt();
	        System.out.print("Product  Price: ");
	        double price = scanner.nextDouble();
	        System.out.print("Product quantity: ");
	        int quantity = scanner.nextInt();
	        
	        
	        

	        Product product = new Product(pid,price,quantity);

	        // Calculate and print taxes
	        System.out.println("\nTax Calculations:");
	        System.out.println("Employee: " + employee);
	        System.out.printf("Income Tax: $%.2f%n", employee.calcTax());

	        System.out.println("\nProduct: " + product);
	        System.out.printf("Sales Tax: $%.2f%n", product.calcTax());

	        scanner.close();
		
	}

}
