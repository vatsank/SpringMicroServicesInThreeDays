package com.example.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.demo.controller.DataNotFoundException;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class MyExceptionHandler {

	
	@ExceptionHandler(DataNotFoundException.class)
	@ResponseStatus(reason="Not Data With That id",code=HttpStatus.CONFLICT)
	public void exceptionHandler() {
		
		log.info("Data Not found Exception Called");
	}
}
