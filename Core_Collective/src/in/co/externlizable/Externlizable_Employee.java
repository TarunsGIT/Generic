package in.co.externlizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Externlizable_Employee implements Externalizable {

	private String firstName;
	private String lastName;
	private Long age;
	private String city;

	public Externlizable_Employee() {
		System.out
				.println("Externlizable Uses Default Constructor for Deserilization");
	}

	public Externlizable_Employee(String firstName, String lastName, Long age,
			String city) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.city = city;

	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Long getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(firstName);
		out.writeObject(lastName);
		out.writeLong(age);
		out.writeObject(city);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		firstName = (String) in.readObject();
		lastName = (String) in.readObject();
		age = in.readLong();
		city = (String) in.readObject();
	}

	@Override
	public String toString() {
		return "Externlizable_Employee [firstName=" + firstName + ", lastName="
				+ lastName + ", age=" + age + ", city=" + city + "]";
	}

}
