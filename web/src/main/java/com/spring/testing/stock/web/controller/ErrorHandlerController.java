package com.spring.testing.stock.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.spring.testing.stock.web.service.ErrorResponse;

@ControllerAdvice
public class ErrorHandlerController {
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> handleError(Exception e) {

		ErrorResponse er = new ErrorResponse();

		er.setErrorcode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		er.setErrorMessage(e.getMessage());

		return new ResponseEntity<ErrorResponse>(er, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
