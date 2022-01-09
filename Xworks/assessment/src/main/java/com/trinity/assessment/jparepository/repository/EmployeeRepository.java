package com.trinity.assessment.jparepository.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trinity.assessment.jparepository.model.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}