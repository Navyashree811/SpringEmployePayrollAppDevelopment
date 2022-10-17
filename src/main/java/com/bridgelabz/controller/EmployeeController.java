package com.bridgelabz.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.dto.ResponseDto;
import com.bridgelabz.dto.EmployeePayrollDTO;
import com.bridgelabz.model.EmployeeData;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeeController {

	@RequestMapping(value = { "", "/", "/get" })
	public ResponseEntity<ResponseDto> getEmployeePayrollData() {
		EmployeeData emp = null;
		emp = new EmployeeData(1, new EmployeePayrollDTO("Navya", 2000000));
		ResponseDto resDTO = new ResponseDto("Get Call Successful", emp);
		return new ResponseEntity<ResponseDto>(resDTO, HttpStatus.OK);
	}

	@GetMapping("/getUserById/{id}")
	public ResponseEntity<ResponseDto> getUserById(@PathVariable("id") int id) {
		EmployeeData emp = null;
		emp = new EmployeeData(1, new EmployeePayrollDTO("navya", 30000000));
		ResponseDto dto = new ResponseDto("Get call Successful", emp);
		return new ResponseEntity<ResponseDto>(dto, HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<ResponseDto> addEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO) {
		EmployeeData emp = null;
		emp = new EmployeeData(1, employeePayrollDTO);
		ResponseDto responseDto = new ResponseDto("Created Employee Payroll Data Successfully", emp);

		return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<ResponseDto> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO) {
		EmployeeData emp = null;
		emp = new EmployeeData(1, employeePayrollDTO);
		ResponseDto responseDto = new ResponseDto("Update Employee Payroll Data Successfully", emp);
		return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
	}

	@DeleteMapping("/delate/{empId}")
	public ResponseEntity<ResponseDto> deleteEmployeePayrollData(@PathVariable("empId") int empId) {

		ResponseDto responseDto = new ResponseDto("Delete Employee Payroll Data Successfully", empId);

		return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
	}

}