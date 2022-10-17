package com.bridgelabz.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.dto.EmployeePayrollDTO;
import com.bridgelabz.model.EmployeeData;
import com.bridgelabz.service.IEmployeePayrollService;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

	private List<EmployeeData> empList = new ArrayList<>();

	@Override
	public List<EmployeeData> getEmployeePayrollData() {

		return empList;
	}

	@Override
	public EmployeeData getEmployeePayrollDataById(int empId) {

		return empList.get(empId - 1);
	}

	@Override
	public EmployeeData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
		EmployeeData emp = null;
		emp = new EmployeeData(empList.size() + 1, employeePayrollDTO);
		empList.add(emp);

		return emp;
	}

	@Override
	public EmployeeData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO) {
		EmployeeData emp = this.getEmployeePayrollDataById(empId);

		employeePayrollDTO.setSalary(employeePayrollDTO.salary);
		employeePayrollDTO.setName(employeePayrollDTO.name);

		emp.setEmployeePayrollDTO(employeePayrollDTO);
		empList.set(empId - 1, emp);

		return emp;
	}

	@Override
	public void deleteEmployeePayrollData(int empId) {

		empList.remove(empId);

	}

}
