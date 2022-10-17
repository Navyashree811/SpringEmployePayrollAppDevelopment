package com.bridgelabz.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.bridgelabz.service.IEmployeePayrollService;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeeController {

	@Autowired
	IEmployeePayrollService employeePayrollService;

	@RequestMapping(value = { "", "/", "/get" })
	public ResponseEntity<ResponseDto> getEmployeePayrollData() {
		List<EmployeeData> empList = null;
		empList = employeePayrollService.getEmployeePayrollData();
		ResponseDto resDTO = new ResponseDto("Get Call Successful", empList);
		return new ResponseEntity<ResponseDto>(resDTO, HttpStatus.OK);
	}

	@GetMapping("/getUserById/{id}")
	public ResponseEntity<ResponseDto> getUserById(@PathVariable("id") int id) {
		EmployeeData emp = null;
		emp = employeePayrollService.getEmployeePayrollDataById(id);
		ResponseDto dto = new ResponseDto("Get call Successful", emp);
		return new ResponseEntity<ResponseDto>(dto, HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<ResponseDto> addEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO) {
		EmployeeData emp = null;
		emp = employeePayrollService.createEmployeePayrollData(employeePayrollDTO);
		ResponseDto responseDto = new ResponseDto("Created Employee Payroll Data Successfully", emp);

		return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
	}

	@PutMapping("/update/{empId}")
	public ResponseEntity<ResponseDto> updateEmployeePayrollData(@PathVariable("empId") int empId,
			@RequestBody EmployeePayrollDTO employeePayrollDTO) {
		EmployeeData emp = null;
		emp = employeePayrollService.updateEmployeePayrollData(empId, employeePayrollDTO);
		ResponseDto responseDto = new ResponseDto("Update Employee Payroll Data Successfully", emp);
		return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
	}

	@DeleteMapping("/delate/{empId}")
	public ResponseEntity<ResponseDto> deleteEmployeePayrollData(@PathVariable("empId") int empId) {

		employeePayrollService.deleteEmployeePayrollData(empId);

		ResponseDto responseDto = new ResponseDto("Delete Employee Payroll Data Successfully", empId);

		return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
	}
}