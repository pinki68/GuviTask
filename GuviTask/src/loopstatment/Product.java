package oopsProgramming;

public class Product implements Taxable {
	
	private int pid;
	private double price;
	private int quantity;
	  

    public Product(int pid, double Price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public double calcTax() {
        return price * SALES_TAX;
    }

    public int getPid() {
        return pid;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product [pid=" + pid + ", quantity=" + quantity + ", price " + price + "]";
    }

}
