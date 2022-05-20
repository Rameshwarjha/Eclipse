package net.javaguides.springBootBackend.service;

import java.util.List;

import net.javaguides.springBootBackend.model.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(long id);
	
}
