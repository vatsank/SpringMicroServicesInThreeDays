package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class DataNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
