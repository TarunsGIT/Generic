package in.co.equalsandhashcode;

public class Driver {

	private String firstName;
	private String lastName;
	private String licenceNo;

	public Driver(String FN, String LN, String LNo) {
		this.firstName = FN;
		this.lastName = LN;
		this.licenceNo = LNo;

	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return false;
		}
		if (obj == null) {
			return false;
		}
		if (obj.getClass() != this.getClass()) {
			return false;
		}
		if (obj instanceof Driver) {
			Driver dr = (Driver) obj;
			return this.licenceNo.equals(dr.licenceNo);
		}
		return false;

	}

	@Override
	public int hashCode() {
		return this.licenceNo.hashCode();
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getLicenceNo() {
		return licenceNo;
	}

	public String toString() {
		return "firstName : " + firstName + " Last Name : " + lastName
				+ " Licence No : " + licenceNo;
	}
}
