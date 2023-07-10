package dao;

import java.util.List;

import model.Employee;

public interface EmployeeDAO {
	
	void save(Employee employee);
	
	void delete(String name);
	
	List<Employee> findAll();

}
