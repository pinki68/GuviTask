package loopstatment;

public class ReverseNum {

	public static void main(String[] args) {
		
		int num = 876;
		int temp = 0;
		
		while(num != 0) {
			int digit = num % 10;
			temp = temp * 10 + digit;
			
			//remove the last digit from num
			num /= 10;
		}
		System.out.println("Reverse num:" + temp);
	}

}