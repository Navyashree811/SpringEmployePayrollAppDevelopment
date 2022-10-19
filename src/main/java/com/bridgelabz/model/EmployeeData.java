package com.bridgelabz.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import com.bridgelabz.dto.EmployeePayrollDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "employee_payroll_spring")
public class EmployeeData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "emp_id")
	private int employeeId;

	@Column(name = "name")
	private String name;
	private long salary;
	private String gender;
	private LocalDate startDate;
	private String note;
	private String profilePic;;

	@ElementCollection
	@CollectionTable(name = "employee_department", joinColumns = @JoinColumn(name = "id"))
	@Column(name = "department")
	private List<String> derartments;

	public EmployeeData(int employeeId, EmployeePayrollDTO empPayrollDTO) {
		this.updateEmployeePayrollData(empPayrollDTO);
	}

	public void updateEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
		this.name = empPayrollDTO.name;
		this.salary = empPayrollDTO.salary;
		this.gender = empPayrollDTO.gender;
		this.note = empPayrollDTO.note;
		this.startDate = empPayrollDTO.startDate;
		this.profilePic = empPayrollDTO.profilePic;
		this.derartments = empPayrollDTO.department;
	}

}
