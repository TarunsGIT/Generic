package in.co.webservice.em.service;

import in.co.webservice.em.bean.EmployeeBean;

import java.util.List;

public interface EmployeeServiceInt {

	public List<EmployeeBean> getEmployees();

	public EmployeeBean findByEmployeeID(Long EmployeeID);

	public int deleteEmployee(Long EmployeeID);

	public int updateEmployee(EmployeeBean employee);

	public int addEmployee(EmployeeBean employee);

}
