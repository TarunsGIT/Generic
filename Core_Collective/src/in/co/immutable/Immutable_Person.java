package in.co.immutable;

public final class Immutable_Person {

	private final String firstName;
	private final String lastName;

	public Immutable_Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public static void main(String[] args) {
		
		Immutable_Person p=new Immutable_Person("Dhvani", "Bhanusali");
		System.out.println(p.getFirstName());
		System.out.println(p.getLastName());
		
	}

}
