package com.trinity.assessment.jparepository.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.trinity.assessment.exception.ResourceNotFoundException;
import com.trinity.assessment.jparepository.model.Employee;
import com.trinity.assessment.jparepository.repository.EmployeeRepository;



@Service
public  class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

//	@Override
//	public List<Employee> getAllEmployees() {
//		return employeeRepository.findAll();
//	}
//
//	@Override
//	public Employee getEmployeeById(long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Employee updateEmployee(Employee employee, long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void deleteEmployee(long id) {
//		// TODO Auto-generated method stub
//		
//	}

	
	
}
