package com.example.demo.exceptions;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class ExceptionResponse {

	  private LocalDate timestamp;
	  private String message;
	  private String details;
	  private String httpCodeMessage;

}
