package loopstatment;

import java.util.Scanner;

public class PurchaseAmount {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		//prompt the user to enter the purchase amount
		System.out.println("Enter the purchase amount: ");
		double purchAmount = sc.nextDouble();
		
		double discount = 0;
		
		//apply discount based on purchase amount
		if(purchAmount >= 500 && purchAmount <= 1000) {
			discount = 0.10 * purchAmount; //10% discount
			
		}else if(purchAmount > 1000) {
			discount = 0.20 * purchAmount; // 20% discount
		}
		
		//calculate the final payable amount
		double finalAmount = purchAmount - discount;
		
		//display the results
		System.out.println("Purchase Amount: " + purchAmount);
		System.out.println("Discount Applied" + discount);
		System.out.println("Final Payable Amount: " + finalAmount);
		
		sc.close();
	
	}

}
