package in.co.webservice.em.dao;

import in.co.webservice.em.bean.EmployeeBean;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("employeeDAO")
public class EmployeeDAOHibImpl implements EmployeeDAOInt {

	@Autowired
	SessionFactory sessionFactory;

	public List<EmployeeBean> getEmployees() {

		// sessionFactory = new
		// Configuration().configure().buildSessionFactory();
		Session s = sessionFactory.openSession();
		Criteria ct = s.createCriteria(EmployeeDAOHibImpl.class);
		ct.addOrder(Order.desc("id"));
		Query q = s.createQuery("from EmployeeBean");
		List<EmployeeBean> employees = q.list();
		return employees;
	}

	public EmployeeBean findByEmployeeID(Long ID) {
		// sessionFactory = new
		// Configuration().configure().buildSessionFactory();
		Session s = sessionFactory.openSession();
		/*
		 * Query q = s.createQuery("from EmployeeBean where id=?"); q.setLong(0,
		 * ID);
		 */
		Criteria criteria = s.createCriteria(EmployeeBean.class).add(
				Restrictions.eq("id", ID));
		List<EmployeeBean> list = criteria.list();
		EmployeeBean employee = null;
		if (list.size() == 1) {
			employee = list.get(0);
			s.evict(employee);
		}
		return employee;
	}

	public int deleteEmployee(Long id) {
		int count = 0;
		// sessionFactory = new
		// Configuration().configure().buildSessionFactory();
		Session s = sessionFactory.openSession();
		// s.delete(id);
		if (s.isConnected()) {
			s.delete(id);
			count = 1;
		}
		return count;
	}

	public int updateEmployee(EmployeeBean employee) {
		int count = 0;
		// sessionFactory = new
		// Configuration().configure().buildSessionFactory();
		Session s = sessionFactory.openSession();
		s.update(employee);
		if (s.isConnected()) {
			s.update(employee);
			count = 1;
		}

		return count;
	}

	public int addEmployee(EmployeeBean employee) {
		int count = 0;
		// sessionFactory = new
		// Configuration().configure().buildSessionFactory();
		Session s = sessionFactory.openSession();
		if (s.isConnected()) {
			count = (Integer) s.save(employee);
		}
		return count;
	}

}
