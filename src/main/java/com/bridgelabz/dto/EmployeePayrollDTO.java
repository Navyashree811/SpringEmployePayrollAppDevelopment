package com.bridgelabz.dto;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;

@Data
public class EmployeePayrollDTO {

	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name Invalid ")
	@NotEmpty(message = "Employee Name cannot be null !")
	public String name;

	@Min(value = 500, message = "Min wage should be more than 500")
	public long salary;

	public String gender;
	public String startDate;
	public String note;
	public String profilePic;
	public List<String> department;

}
