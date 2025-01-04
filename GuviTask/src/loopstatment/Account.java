package oopstask1;

public class Account {

	//data member
	private double balance;
	
	//no argument constructor
	public Account() {
		this.balance = 0.0;
	}
	
	//constructor with two arguments
	public Account(double balance1) {
		if(balance1 >= 0)
		{
			this.balance = balance1;
			
		}else {
			System.out.println("Initial balance.");
			this.balance = 0.0;
		}
		
	}
	
	//method to deposit amount to the account
	public void deposit(double amount)
	{
		if(amount > 0) {
			balance += amount;
			System.out.println("Deposited: " + amount);
		}else {
			System.out.println("Dpeosit amount .");
		}
	}
	
	//method to withdraw amount from the account
	public void withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("withdraw: " + amount);
		}else if(amount > balance) {
			System.out.println("Insufficient balance.");
		}else {
			System.out.println("Withdrawal amount");
		}
	}
	
	//method to display the balance
	public void displayBalance() {
		System.out.println("Current balance: " + balance);
	}
	
	//main method to test the account class
	public static void main(String[] args) {
		//createin an account with no initial balance
		Account a1 = new Account();
		a1.displayBalance();
		
		//depositing ammount
		a1.deposit(200);
		a1.displayBalance();
		
		//withdrawing amount
		a1.withdraw(100);
		a1.displayBalance();
		
		//trying to withdraw more than the balance
		a1.withdraw(200);
		a1.displayBalance();
		
		//creating an account with an initia balance
		Account a2 = new Account(300);
		a2.displayBalance();
		
		//depositing amount
		a2.deposit(50);
		a2.displayBalance();
		
		//withdrawing amount
		a2.withdraw(30);
		a2.displayBalance();

	}

}
