/**
 * 
 */
package com.bridgelabz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.model.EmployeeData;

/**
 * @author dell
 *
 */
public interface EmployeePayrollRepository extends JpaRepository<EmployeeData, Integer> {

}
