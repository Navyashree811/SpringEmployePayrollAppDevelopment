package com.bridgelabz.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.dto.EmployeePayrollDTO;
import com.bridgelabz.model.EmployeeData;
import com.bridgelabz.service.IEmployeePayrollService;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

	@Override
	public List<EmployeeData> getEmployeePayrollData() {

		List<EmployeeData> empList = new ArrayList<>();

		empList.add(new EmployeeData(1, new EmployeePayrollDTO("Puja", 30000)));

		return empList;
	}

	@Override
	public EmployeeData getEmployeePayrollDataById(int empId) {
		EmployeeData emp = null;

		emp = new EmployeeData(1, new EmployeePayrollDTO("Pankaj", 20000));
		return emp;
	}

	@Override
	public EmployeeData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
		EmployeeData emp = null;
		emp = new EmployeeData(1, employeePayrollDTO);
		return emp;
	}

	@Override
	public EmployeeData updateEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
		EmployeeData emp = null;

		emp = new EmployeeData(1, employeePayrollDTO);

		return emp;
	}

	@Override
	public void deleteEmployeePayrollData(int empId) {

	}

}
