package in.co.webservice.em.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "EmployeeBean")
public class EmployeeBean {

	private static final long serialVersionUID = -7171483644363225303L;

	@Id
	@GenericGenerator(name = "hiIncrement", strategy = "increment")
	@GeneratedValue(generator = "hiIncrement")
	@Column(name = "ID", unique = true, nullable = false)
	protected Long id;

	@Column(name = "EMPLOYEE_ID", unique = true, nullable = false)
	private Long employeeId;
	@Column(name = "FIRST_NAME", length = 50)
	private String firstName;
	@Column(name = "LAST_NAME", length = 50)
	private String lastName;
	@Column(name = "AGE")
	private Long age;

	public EmployeeBean() {

	}

	public EmployeeBean(@JsonProperty("id") Long id,
			@JsonProperty("employeeId") Long employeeId,
			@JsonProperty("firstName") String firstName,
			@JsonProperty("lastName") String lastName,
			@JsonProperty("age") Long age) {

		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;

	}

	public Long getId() {
		return id;
	}

	public Long getEmployeeId() {
		return employeeId;
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

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("ID:- " + getId());
		str.append("Employee Id:- " + getEmployeeId());
		str.append(" First Name:- " + getFirstName());
		str.append(" Last Name:- " + getLastName());
		str.append(" Age:- " + getAge());
		return str.toString();
	}

}
