package in.co.webservice.em.dao;

import in.co.webservice.em.bean.EmployeeBean;

import java.util.List;

public interface EmployeeDAOInt {

	public List<EmployeeBean> getEmployees();
	public EmployeeBean findByEmployeeID(Long ID);
	public int deleteEmployee(Long id);
	public int updateEmployee(EmployeeBean employee);
	public int addEmployee(EmployeeBean employee);
	
	
}
