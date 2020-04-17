package com.ibm.ditspringbootproject.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ibm.ditspringbootproject.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	public Employee findByName(String name);
	//public List<Employee> findBySalaryLessThan(double salary);
//	public List<Employee> findBySalary(double salary);
	public List<Employee> findBySalary(Double salary);
	public List<Employee> findBySalaryBetween(Double salary1, Double salary2);
	public Optional<Employee> findById(Integer id); 
		
    
}
