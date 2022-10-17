package com.bridgelabz.model;

import com.bridgelabz.dto.EmployeePayrollDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeeData {
	private int employeeId;
	private EmployeePayrollDTO employeePayrollDTO;

}
