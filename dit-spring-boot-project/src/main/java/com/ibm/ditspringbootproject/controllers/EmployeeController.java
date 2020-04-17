package com.ibm.ditspringbootproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.ditspringbootproject.entities.Employee;
import com.ibm.ditspringbootproject.repos.EmployeeRepository;
import com.ibm.ditspringbootproject.services.EmployeeService;



@RestController
@CrossOrigin
@RequestMapping(path="/api")
public class  EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@RequestMapping(path="/employee/{id}" , method=RequestMethod.DELETE)
	public ResponseEntity<Void> deleteEmployee(@PathVariable("id") int id){
		ResponseEntity<Void> re= null;
		try{
			employeeService.deleteEmployeeById(id);
			re = new ResponseEntity<>(HttpStatus.OK);
			
		}
		catch(EmptyResultDataAccessException e){
			re = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return re;
		
	}
	
	@PostMapping("/employee")
	public ResponseEntity<Void> addEmployee(@RequestBody Employee employee){
		
		employeeService.addEmployee(employee);
		ResponseEntity<Void> re = new ResponseEntity<>(HttpStatus.CREATED);
		return re;
	}
	
	@GetMapping("/employee")
	public List<Employee> findEmployee(){

		List<Employee> employees = employeeService.fetchAllEmployees();
		return employees;
	}
	
	@GetMapping("/employee/name/{name}")
	public Employee findEmployee(@PathVariable("name") String name){

		Employee employee =  employeeService.fetchAllEmployeesByName(name);
		return employee;
	}
	@GetMapping("/employee/salary/{salary}")
	public List<Employee> findEmployeeBySalary(@PathVariable("salary") Double salary){

		List<Employee> employees =  employeeService.fetchAllEmployeesBySalary(salary);
		return employees;
	}
	
	 	
	
	@GetMapping("/employee/salary/{salary1}/between/{salary2}")
	public List<Employee> SalaryRange(@PathVariable("salary1") Double salary1,@PathVariable("salary2") Double salary2){

		List<Employee> employees =  employeeService.SalaryRange(salary1,salary2);
		return employees;
	}
	
	
	}


