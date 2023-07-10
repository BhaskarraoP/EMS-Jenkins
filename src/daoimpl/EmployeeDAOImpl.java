package daoimpl;

import java.util.ArrayList;
import java.util.List;

import dao.EmployeeDAO;
import model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	private List<Employee> employeeRepository;
	
	

	public EmployeeDAOImpl() {
		employeeRepository = new ArrayList<>();
	}



	@Override
	public void save(Employee employee) {
		employeeRepository.add(employee);
		
	}


	@Override
	public List<Employee> findAll() {
		return employeeRepository;
	}



	@Override
	public void delete(String name) {
		employeeRepository.remove(name);
	}
	
	

}
