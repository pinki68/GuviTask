package loopstatment;

public class PatternDemo {

	public static void main(String[] args) {

		int i, j, k = 5;

		for (i = k; i > 0; i--) {
			for (j = k; j >= i; j--) {
				System.out.print(j);
			}
			for (int m = i - 1; m > 0; m--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
