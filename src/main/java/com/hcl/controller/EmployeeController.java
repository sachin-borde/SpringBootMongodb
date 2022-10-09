package com.hcl.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.model.Employee;
import com.hcl.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/getemployeebyid/{empid}")
	public Optional<Employee> getEmployeeById(@PathVariable("empid") int empid) {
		return employeeService.getEmployeeById(empid);
	}

	@GetMapping("getallemployee")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}

	@PostMapping("/saveemployee")
	public ResponseEntity<String> saveEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
		return new ResponseEntity<String>("data save successfully", HttpStatus.OK);
	}

	@PostMapping("saveemployeelist")
	public ResponseEntity<String> saveEmployeeList(@RequestBody List<Employee> employees) {
		employeeService.saveEmployeeList(employees);
		return new ResponseEntity<String>("data save successfully", HttpStatus.OK);
	}

	@PutMapping("/updateemployee/{empid}")
	public ResponseEntity<String> updateEmployee(@PathVariable("empid") int empid, @RequestBody Employee employee) {
		employeeService.updateEmployee(empid, employee);
		return new ResponseEntity<String>("data updated successfully", HttpStatus.OK);
	}

	@DeleteMapping("deleteemployeebyid/{empid}")
	public ResponseEntity<String> deleteEmployeeById(@PathVariable("empid") int empid) {
		employeeService.deleteEmployeeById(empid);
		return new ResponseEntity<String>("data deleted successfully", HttpStatus.OK);
	}

	@DeleteMapping("deleteallemployee")
	public ResponseEntity<String> deleteAllEmployee() {
		employeeService.deleteAllEmployee();
		return new ResponseEntity<String>("all data deleted successfully", HttpStatus.OK);
	}
}
