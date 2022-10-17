package com.bridgelabz.model;

public class EmployeeData {
	private int employeeId;
	private String empName;
	private long salry;

	public EmployeeData(int employeeId, String empName, long salry) {
		super();
		this.employeeId = employeeId;
		this.empName = empName;
		this.salry = salry;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getSalry() {
		return salry;
	}

	public void setSalry(long salry) {
		this.salry = salry;
	}

	public EmployeeData() {

	}

}
