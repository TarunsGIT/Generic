package in.co.serialization;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = -3591882048573356677L;
	private String firstName;
	private String lastName;
	static private Long age;
	private String city;

	public Employee(String firstName, String lastName, long age, String city) {
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

}
