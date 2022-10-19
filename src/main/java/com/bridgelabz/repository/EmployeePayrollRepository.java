/**
 * 
 */
package com.bridgelabz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bridgelabz.model.EmployeeData;

/**
 * @author dell
 *
 */
public interface EmployeePayrollRepository extends JpaRepository<EmployeeData, Integer> {

	@Query(value = "SELECT * FROM employee_payroll_spring, employee_department where emp_id = id and department = department;", nativeQuery = true)
	List<EmployeeData> findEmployeeByDepartment(String department);
}
