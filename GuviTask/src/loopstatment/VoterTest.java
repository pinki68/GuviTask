package exception_collection;

public class VoterTest {

	public static void main(String[] args) {
		try {
			// Valid voter
			Voter voter1 = new Voter(101, "Sohan Kumar", 25);
			System.out.println(voter1);

			// Invalid voter (age less than 18)
			Voter voter2 = new Voter(102, "Sunita Gupta", 16);
			System.out.println(voter2);
		} catch (InvalidVoterAgeException e) {
			System.err.println(e.getMessage());
		}
	}

}
