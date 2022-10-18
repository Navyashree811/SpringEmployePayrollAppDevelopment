package com.bridgelabz.dto;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class EmployeePayrollDTO {

	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name Invalid ")
	@NotEmpty(message = "Employee Name cannot be null !")
	public String name;

	@Min(value = 500, message = "Min wage should be more than 500")
	public long salary;

	@Pattern(regexp = "male|female", message = "Gender needs to be male or female")
	public String gender;

	@JsonFormat(pattern = "dd MM yyyy")
	@NotNull(message = "startDate should Not be Empty")
	@PastOrPresent(message = "startDate should be past or today date")
	public String startDate;

	@NotBlank(message = "Note cannot be Empty")
	public String note;

	@NotBlank(message = "ProfilePic cannot be Empty")
	public String profilePic;

	@NotNull(message = "department should Not be Empty")
	public List<String> department;

}
