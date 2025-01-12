package exception_collection;

//User-defined exception for invalid age
public class AgeNotWithinRangeException extends Exception {

	public AgeNotWithinRangeException(String message) {
		super(message);
	}
}
