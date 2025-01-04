package oopstask1;

import java.util.Scanner;

public class XYZ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Product[] pro = new Product[5];
		
		//Accepting five product information from user
		for(int i=0; i<5; i++)
		{
			System.out.println("Enter product id, price,and quantity for product " + (i+1) + ":");
			int pid = sc.nextInt();
			int price = sc.nextInt();
			double quantity = sc.nextInt();
			pro[i] = new Product(pid, price,quantity);
		}
		
		//find pid of the product with the hight price
		int highestPrice = findHighestPrice(pro);
		System.out.println("Pid of the product with highest price: " + highestPrice);
		
		//calculating the total amount spent on all products
		double totalAmount =  calculTotalAmount(pro);
		System.out.println("Total amount spent on all products: " + totalAmount);
	}
	
	//method to find Pid of the product with the highest price
	public static int findHighestPrice(Product[] pro)
	{
		int pid = -1;
		double hightPrice = Double.MAX_VALUE;
		
		for(Product product : pro)
		{
			if(product.price > hightPrice) {
				hightPrice = product.price;
				pid = product.pid;
			}
			
		}
		return pid;
	}
	//method to calaulate the total amount spent on all products
	public static double calculTotalAmount(Product[] pro)
	{
		double totalAmount = 0;
		for(Product product : pro)
		{
			totalAmount += product.price * product.quantity;
		}
		return totalAmount;
	}

}
