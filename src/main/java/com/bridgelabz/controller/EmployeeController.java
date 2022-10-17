package com.bridgelabz.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.dto.EmployeeDto;
import com.bridgelabz.model.EmployeeData;

@RestController
public class EmployeeController {
	private static final String template = "Hello world";
	private final AtomicLong counter = new AtomicLong();	
	
	
	 @GetMapping("/getUserById/{id}")
	    public ResponseEntity<EmployeeDto> getUserById(@PathVariable("id") int id){
		 EmployeeData emp = null;
		 emp = new EmployeeData(1,"Navya",450000);
		 EmployeeDto dto = new EmployeeDto("Get call Successful" , emp);
	        return new ResponseEntity<EmployeeDto>(dto , HttpStatus.OK);
	    }

}
