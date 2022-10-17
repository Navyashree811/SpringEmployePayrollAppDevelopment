package com.bridgelabz.model;

import com.bridgelabz.dto.EmployeePayrollDTO;

public class EmployeeData {
	private int employeeId;
	private EmployeePayrollDTO employeePayrollDTO;

	public EmployeeData(int employeeId, EmployeePayrollDTO employeePayrollDTO) {
		super();
		this.employeeId = employeeId;
		this.employeePayrollDTO = employeePayrollDTO;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public EmployeePayrollDTO getEmployeePayrollDTO() {
		return employeePayrollDTO;
	}

	public void setEmployeePayrollDTO(EmployeePayrollDTO employeePayrollDTO) {
		this.employeePayrollDTO = employeePayrollDTO;
	}

	@Override
	public String toString() {
		return "EmployeeData [employeeId=" + employeeId + ", employeePayrollDTO=" + employeePayrollDTO + "]";
	}

}
