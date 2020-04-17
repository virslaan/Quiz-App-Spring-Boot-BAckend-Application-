package com.ibm.ditspringbootproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.ditspringbootproject.entities.Employee;
import com.ibm.ditspringbootproject.repos.EmployeeRepository;



@Service
public class FlightService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> fetchAllEmployees(){
		return employeeRepository.findAll();
	}

	public void addEmployee(Employee toAdd) {
		try {
//			employeeRepository.addEmployee(toAdd);
			employeeRepository.save(toAdd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

//	public Employee findEmployeeById(int id) {
//		if(id<=0){
//			
//		}
//		return employeeRepository.findBy
//		
//	}

	public void deleteEmployeeById(int id) {
		
		employeeRepository.deleteById(id);
		
	}

	public void updateEmployee(Employee updatedEmployee) {
//		employeeRepository.updateEmployee(updatedEmployee);
		
	}

	public Employee fetchAllEmployeesByName(String name) {
		return employeeRepository.findByName(name);
		
	}

	
	
	public List<Employee> fetchAllEmployeesBySalary(Double salary) {
		// TODO Auto-generated method stub
		return employeeRepository.findBySalary(salary)	;
}

	public List<Employee> SalaryRange(Double salary1, Double salary2) {
		// TODO Auto-generated method stub
		return employeeRepository.findBySalaryBetween(salary1,salary2)	;

	}

	
	
}
