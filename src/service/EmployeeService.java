package service;

import java.util.List;

import model.Employee;

public interface EmployeeService {
	
	void createEmployee(Employee employee);
	
	List<Employee> showAll();
	
	void delete(String name);

}
