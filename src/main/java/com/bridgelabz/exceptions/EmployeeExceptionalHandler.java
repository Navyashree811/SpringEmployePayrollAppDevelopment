package com.bridgelabz.exceptions;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.bridgelabz.dto.ResponseDto;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class EmployeeExceptionalHandler {

	private static final String message = "Exception while Processsing REST Request ";

	@ExceptionHandler(HttpMessageNotReadableException.class)

	public ResponseEntity<ResponseDto> handleHttpMessageNotReadableException(
			HttpMessageNotReadableException exception) {

		log.error("Invalid Data Formate", exception);
		ResponseDto responseDTO = new ResponseDto(message, "Should have date in the Formate dd MM yyyy");
		return new ResponseEntity<ResponseDto>(responseDTO, HttpStatus.BAD_REQUEST);

	}

	@ExceptionHandler(MethodArgumentNotValidException.class)

	public ResponseEntity<ResponseDto> handleMethodArgumentNotValidException(
			MethodArgumentNotValidException exception) {
		List<ObjectError> errorList = exception.getBindingResult().getAllErrors();
		List<String> errMesg = errorList.stream().map(objErr -> objErr.getDefaultMessage())
				.collect(Collectors.toList());
		ResponseDto responseDTO = new ResponseDto("Exception while processing REST Request", errMesg);

		return new ResponseEntity<ResponseDto>(responseDTO, HttpStatus.BAD_REQUEST);

	}

	@ExceptionHandler(EmployeePayrollException.class)

	public ResponseEntity<ResponseDto> handleEmployeePayrollException(EmployeePayrollException exception) {

		ResponseDto responseDTO = new ResponseDto("Exception while processing REST Request", exception.getMessage());

		return new ResponseEntity<ResponseDto>(responseDTO, HttpStatus.BAD_REQUEST);

	}
}