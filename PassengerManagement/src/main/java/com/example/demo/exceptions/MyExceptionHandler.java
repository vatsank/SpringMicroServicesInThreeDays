package com.example.demo.exceptions;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.controller.DataNotFoundException;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class MyExceptionHandler {

	
	@Autowired
	private ExceptionResponse resp;
	
	@ExceptionHandler(ResponseStatusException.class)
	public ResponseEntity<ExceptionResponse> exceptionHandler(Throwable ex,WebRequest request) {
		
		
		log.info("Data Not found Exception Called");
		
		
		resp.setTimestamp(LocalDate.now());
		resp.setDetails(request.getDescription(false));
		resp.setMessage(HttpStatus.CONFLICT.getReasonPhrase());
		
		
	    return new ResponseEntity<ExceptionResponse>(resp,HttpStatus.CONFLICT);



	}
	
	
    

}
