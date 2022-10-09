package com.hcl.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.model.Employee;
import com.hcl.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public Optional<Employee> getEmployeeById(int empid) {
		return employeeRepository.findById(empid);
	}

	public List<Employee> getAllEmployee() {
		return (List<Employee>) employeeRepository.findAll();
	}

	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	public void saveEmployeeList(List<Employee> employees) {
		employeeRepository.saveAll(employees);
	}

	public void updateEmployee(int empid, Employee employee) {
		employeeRepository.save(employee);
	}

	public void deleteEmployeeById(int empid) {
		employeeRepository.deleteById(empid);
	}

	public void deleteAllEmployee() {
		employeeRepository.deleteAll();
	}
}
