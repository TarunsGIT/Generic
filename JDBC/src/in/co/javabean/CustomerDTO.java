package in.co.javabean;

public class CustomerDTO {

	private long customer_ID;
	private String firstName;
	private String lastName;
	private String city;
	private double balance;

	public long getCustomer_ID() {
		return customer_ID;
	}

	public void setCustomer_ID(long customer_ID) {
		this.customer_ID = customer_ID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
