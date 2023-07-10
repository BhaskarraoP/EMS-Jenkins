package serviceimpl;

import java.util.List;

import dao.EmployeeDAO;
import daoimpl.EmployeeDAOImpl;
import model.Employee;
import service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeDAO employeeDAO;
	public EmployeeServiceImpl() {
		employeeDAO = new EmployeeDAOImpl();
	}


	@Override
	public void createEmployee(Employee employee) {
		employeeDAO.save(employee);
		
	}


	@Override
	public List<Employee> showAll() {
		return employeeDAO.findAll();
	}


	@Override
	public void delete(String name) {
		employeeDAO.delete(name);
	}
	
	

}
