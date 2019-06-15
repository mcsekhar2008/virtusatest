package com.sekhar.test.exception;

public class InvalidInputException extends Exception{
	private String message;
	public InvalidInputException(Exception e){
		super(e);
		this.message = e.getMessage();
	}
	public InvalidInputException(Exception e, String msg){
		super(e);
		this.message = msg;
	}
	public InvalidInputException(String msg ) {
		super();
		this.message = msg;
	}
	public String getMessage() {
		return message;
	}
	
}
