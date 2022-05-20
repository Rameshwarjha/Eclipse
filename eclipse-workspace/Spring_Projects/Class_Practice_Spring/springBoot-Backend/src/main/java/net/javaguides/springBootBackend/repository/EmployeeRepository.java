package net.javaguides.springBootBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springBootBackend.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
