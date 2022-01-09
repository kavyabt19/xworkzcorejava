package jkzhou.onboarding.employee.repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jkzhou.onboarding.api.Employee;

/**
 * Created by @author J.K. Zhou
 * Date: 2019-08-25
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, UUID>
{

}
