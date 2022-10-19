package com.bridgelabz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.dto.EmployeePayrollDTO;
import com.bridgelabz.exceptions.EmployeePayrollException;
import com.bridgelabz.model.EmployeeData;
import com.bridgelabz.repository.EmployeePayrollRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeePayrollService implements IEmployeePayrollService {

	@Autowired
	private EmployeePayrollRepository employeeRepository;
	private List<EmployeeData> empList = new ArrayList<>();

	@Override
	public List<EmployeeData> getEmployeePayrollData() {

		return empList;
	}

	@Override
	public EmployeeData getEmployeePayrollDataById(int empId) {
		return empList.stream().filter(emp -> emp.getEmployeeId() == empId).findFirst()
				.orElseThrow(() -> new EmployeePayrollException("Employee Not Found"));
	}

	@Override
	public EmployeeData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
		EmployeeData emp = null;
		emp = new EmployeeData(empList.size() + 1, employeePayrollDTO);
		log.debug("Emp Data: " + emp.toString());
		empList.add(emp);
		return employeeRepository.save(emp);
	}

	@Override
	public EmployeeData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO) {
		EmployeeData emp = this.getEmployeePayrollDataById(empId);

		emp.setName(employeePayrollDTO.name);
		emp.setSalary(employeePayrollDTO.salary);
		emp.setDerartments(employeePayrollDTO.department);
		emp.setGender(employeePayrollDTO.gender);
		emp.setNote(employeePayrollDTO.note);
		emp.setProfilePic(employeePayrollDTO.profilePic);
		emp.setStartDate(employeePayrollDTO.startDate);

		empList.set(empId - 1, emp);

		return employeeRepository.save(emp);
	}

	@Override
	public void deleteEmployeePayrollData(int empId) {

		empList.remove(empId);

	}

}
