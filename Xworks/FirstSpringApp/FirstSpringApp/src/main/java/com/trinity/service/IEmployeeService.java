package com.trinity.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trinity.dto.EmployeeDto;
import com.trinity.entity.Employee;
import com.trinity.repository.IEmployeeDao;

@Service("service")
public class IEmployeeService implements EmployeeService {
	@Autowired
	private IEmployeeDao empDao;

	@Override
	public EmployeeDto getEmployeeById(Integer id) throws Exception {
		Employee optional = empDao.findById(id).get();
		EmployeeDto dto = new EmployeeDto();
		BeanUtils.copyProperties(optional, dto);
		return dto;
	}

	@Override
	public EmployeeDto getEmployeeByUserName(String str) {
		Employee findByUname = empDao.findByUname(str);
		EmployeeDto dto = new EmployeeDto();
		BeanUtils.copyProperties(findByUname, dto);
		return dto;
	}

}
