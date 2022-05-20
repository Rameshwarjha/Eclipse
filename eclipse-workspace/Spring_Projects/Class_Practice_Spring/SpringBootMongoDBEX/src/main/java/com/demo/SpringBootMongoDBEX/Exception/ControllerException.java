package com.demo.SpringBootMongoDBEX.Exception;

public class ControllerException {
	
	private String errorCode;
	private String errorMessage;
	public ControllerException(String errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
	public ControllerException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	@Override
	public String toString() {
		return "ControllerException [errorCode=" + errorCode + ", errorMessage=" + errorMessage + "]";
	}
	
	

}
