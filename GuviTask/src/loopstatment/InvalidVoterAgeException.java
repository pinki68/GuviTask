package exception_collection;

//User-defined exception for invalid voter age
public class InvalidVoterAgeException extends Exception {

	public InvalidVoterAgeException(String message) {
		super(message);
	}
}
