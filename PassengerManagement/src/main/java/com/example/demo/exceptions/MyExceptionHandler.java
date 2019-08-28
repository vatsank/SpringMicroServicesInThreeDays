package com.example.demo.exceptions;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.controller.DataNotFoundException;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class MyExceptionHandler extends ResponseEntityExceptionHandler {

	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionResponse> handleDataNotFound(DataNotFoundException ex,WebRequest request) {
		
		
		log.info("Data Not found Exception Called");
		
		
	    ExceptionResponse exceptionResponse = 
	    		new ExceptionResponse(LocalDate.now(), ex.getMessage(),
	            request.getDescription(false),HttpStatus.NO_CONTENT.getReasonPhrase());
	   
	    
	    return new ResponseEntity<>(exceptionResponse, 
	    		        HttpStatus.NO_CONTENT);



	}
	
	
    

}


