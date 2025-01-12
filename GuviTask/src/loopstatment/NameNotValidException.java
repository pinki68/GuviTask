package exception_collection;

//User-defined exception for invalid name
public class NameNotValidException extends Exception {

	public NameNotValidException(String message) {
		super(message);
	}
}
