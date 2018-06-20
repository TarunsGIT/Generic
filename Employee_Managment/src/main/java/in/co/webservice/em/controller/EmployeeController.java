package in.co.webservice.em.controller;

import java.util.List;

import in.co.webservice.em.bean.EmployeeBean;
import in.co.webservice.em.service.EmployeeServiceInt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	 EmployeeServiceInt service;

	@RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<EmployeeBean>> getAllEmployees() {
		HttpHeaders headers = new HttpHeaders();
		List<EmployeeBean> employees = service.getEmployees();

		if (employees == null) {
			return new ResponseEntity<List<EmployeeBean>>(HttpStatus.NOT_FOUND);

		}

		headers.add("Number of employees found ",
				String.valueOf(employees.size()));
		return new ResponseEntity<List<EmployeeBean>>(employees, headers,
				HttpStatus.OK);
	}

	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
	public ResponseEntity<EmployeeBean> getEmployee(
			@PathVariable("id") Long employeeID) {

		EmployeeBean employee = service.findByEmployeeID(employeeID);
		if (employee == null) {
			return new ResponseEntity<EmployeeBean>(HttpStatus.NOT_FOUND);

		}

		return new ResponseEntity<EmployeeBean>(employee, HttpStatus.OK);

	}

	@RequestMapping(value = "/employee/delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<EmployeeBean> deleteEmployee(
			@PathVariable("id") Long employeeID) {
		HttpHeaders headers = new HttpHeaders();
		EmployeeBean employee = service.findByEmployeeID(employeeID);
		if (employee == null) {
			headers.add("No employee found corrosponding to", "EmployeeID"
					+ employeeID);
			return new ResponseEntity<EmployeeBean>(headers,
					HttpStatus.NOT_FOUND);

		}

		service.deleteEmployee(employeeID);
		headers.add("Deleted Employee", String.valueOf(employeeID));
		return new ResponseEntity<EmployeeBean>(employee, headers,
				HttpStatus.NO_CONTENT);

	}

	@RequestMapping(value = "/employee/{id}", method = RequestMethod.PUT)
	public ResponseEntity<EmployeeBean> updateEmployee(
			@PathVariable("empolyeeID") Long employeeID,
			@RequestBody EmployeeBean employee) {

		HttpHeaders headers = new HttpHeaders();
		EmployeeBean isExist = service.findByEmployeeID(employeeID);
		if (isExist == null) {
			return new ResponseEntity<EmployeeBean>(HttpStatus.NOT_FOUND);
		} else if (employee == null) {
			return new ResponseEntity<EmployeeBean>(HttpStatus.BAD_REQUEST);
		}

		service.updateEmployee(employee);
		headers.add("Employee Updated ", String.valueOf(employeeID));
		return new ResponseEntity<EmployeeBean>(employee, headers,
				HttpStatus.OK);

	}

	@RequestMapping(value = "/employee", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<EmployeeBean> addEmployee(
			@RequestBody EmployeeBean employee) {
		HttpHeaders headers = new HttpHeaders();
		if (employee == null) {
			return new ResponseEntity<EmployeeBean>(HttpStatus.BAD_REQUEST);

		}

		service.addEmployee(employee);
		headers.add("Employee ADDED", String.valueOf(employee.getEmployeeId()));
		return new ResponseEntity<EmployeeBean>(employee, headers,
				HttpStatus.CREATED);
	}

}
