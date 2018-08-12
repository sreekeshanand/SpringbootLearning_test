package com.spring.testing.stock.web.service;

public class ErrorResponse {

	private  int Errorcode ;
	private  String ErrorMessage ;
	
	public int getErrorcode() {
		return Errorcode;
	}
	public void setErrorcode(int errorcode) {
		Errorcode = errorcode;
	}
	public String getErrorMessage() {
		return ErrorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		ErrorMessage = errorMessage;
	}
	
	
	
	
}
