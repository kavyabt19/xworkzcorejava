package com.trinity.service;

import com.trinity.dto.EmployeeDto;

public interface EmployeeService {

	public EmployeeDto getEmployeeById(Integer id) throws Exception;

	EmployeeDto getEmployeeByUserName(String str);
}
