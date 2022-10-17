package com.bridgelabz.dto;

public class EmployeePayrollDTO {
	public String name;
	public long salary;

	public EmployeePayrollDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeePayrollDTO(String name, long salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeePayrollDTO [name=" + name + ", salary=" + salary + "]";
	}

}
