package loopstatment;

public class SmallestNum {

	public static void main(String[] args) {
		int num = 41, num1 = 50, num2 = 60;
		
		if(num >= num1 && num >= num2)
			System.out.println(num + " is the largest number.");
		else if(num1 >= num && num1 >= num2) 
			System.out.println(num1 + " is the largest number.");
		else
			System.out.println(num2 + " is the largest number")	;
		
		

	}

}
