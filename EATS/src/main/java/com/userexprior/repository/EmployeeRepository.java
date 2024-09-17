package com.userexprior.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.userexprior.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	
	@Query(value="SELECT a.*, e.* FROM employee e JOIN activity a ON e.employee_id=a.employee_employee_id\r\n" + 
			"WHERE DATE_SUB(CURRENT_DATE, INTERVAL 7 DAY ) <=  FROM_UNIXTIME(a.time/1000) ORDER BY a.employee_employee_id ", nativeQuery=true)
	List<Object[]> findAllEmployee();
}
