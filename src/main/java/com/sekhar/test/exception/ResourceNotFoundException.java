package com.sekhar.test.exception;

public class ResourceNotFoundException extends Exception{
	private String message;
	public ResourceNotFoundException(Exception e){
		super(e);
		this.message = e.getMessage();
	}
	public ResourceNotFoundException(Exception e, String msg){
		super(e);
		this.message = msg;
	}
	public ResourceNotFoundException(String msg ) {
		super();
		this.message = msg;
	}
	public String getMessage() {
		return message;
	}
	
}
