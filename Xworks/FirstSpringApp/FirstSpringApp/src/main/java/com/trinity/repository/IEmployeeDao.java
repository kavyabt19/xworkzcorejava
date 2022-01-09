package com.trinity.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trinity.entity.Employee;

@Repository
public interface IEmployeeDao extends CrudRepository<Employee, Integer> {
	@Query(value = "select * from employee where ename=?1", nativeQuery = true)
	Employee findByUname(String uname);
}
