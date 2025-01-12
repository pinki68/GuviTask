package exception_collection;

public class Voter {

	private int voterId;
	private String name;
	private int age;

	// Getters for voter details
	public int getVoterId() {
		return voterId;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// Parameterized constructor
	public Voter(int voterId, String name, int age) throws InvalidVoterAgeException {
		if (age < 18) {
			throw new InvalidVoterAgeException("Invalid age for voter");
		}

		this.voterId = voterId;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Voter [Voter ID=" + voterId + ", Name=" + name + ", Age=" + age + "]";
	}

}
