package com.example.demo.controller;

public class DataNotFoundException extends Exception {

	private String message;

	
	public DataNotFoundException(String message) {
		super();
		this.message = message;
	}


	@Override
	public String getMessage() {
		return this.message;
	}
	
	
}
