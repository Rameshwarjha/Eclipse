package net.javaguides.springBootBackend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springBootBackend.exception.ResourceNotFoundException;
import net.javaguides.springBootBackend.model.Employee;
import net.javaguides.springBootBackend.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(long id) {
//		Optional<Employee> employee= employeeRepository.findById(id);
//		if(employee.isPresent()) {
//			return employee.get();
//		}else {
//			throw new ResourceNotFoundException("Employee", "id", id);
//			
//		}
		
		//using lambda
		return employeeRepository.findById(id).orElseThrow(() -> 
							new ResourceNotFoundException("Employee", "Id", id));
	}

}
