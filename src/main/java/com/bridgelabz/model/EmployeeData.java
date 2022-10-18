package com.bridgelabz.model;

import com.bridgelabz.dto.EmployeePayrollDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeData {
	private int employeeId;
	private EmployeePayrollDTO employeePayrollDTO;

}
