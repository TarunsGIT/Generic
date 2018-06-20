package in.co.webservice.em.service;

import in.co.webservice.em.bean.EmployeeBean;
import in.co.webservice.em.dao.EmployeeDAOInt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeService")
public class EmployeeDAOSpringServiceImpl implements EmployeeServiceInt {

	@Autowired
	EmployeeDAOInt employeeDAO;

	public List<EmployeeBean> getEmployees() {
		List<EmployeeBean> employees = employeeDAO.getEmployees();
		return employees;
	}

	public EmployeeBean findByEmployeeID(Long EmployeeID) {
		EmployeeBean employee = employeeDAO.findByEmployeeID(EmployeeID);
		return employee;
	}

	public int deleteEmployee(Long EmployeeID) {
		return employeeDAO.deleteEmployee(EmployeeID);
	}

	public int updateEmployee(EmployeeBean employee) {
		return employeeDAO.updateEmployee(employee);
	}

	public int addEmployee(EmployeeBean employee) {
		return employeeDAO.addEmployee(employee);
	}

	

}
