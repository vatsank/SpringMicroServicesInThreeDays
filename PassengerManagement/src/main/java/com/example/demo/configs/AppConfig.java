package com.example.demo.configs;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.exceptions.ExceptionResponse;
import com.example.demo.model.Passenger;

@Configuration
public class AppConfig {

	
	@Bean
	public Passenger ram() {
	   return new Passenger(101,"Ramesh","ram@abc.com");	
	}
	
	
	@Bean
	public Passenger shyam() {
	   return new Passenger(102,"Shyam","shyam@abc.com");	
	}
	
	@Autowired
	private List<Passenger> passList;
	
	@Bean
	public  HashMap<Long,Passenger> details(){
		
		HashMap<Long, Passenger> details = new HashMap<>();
		
		passList.forEach(eachElement -> {
		
			details.put(eachElement.getId(), eachElement);
			
		});
		
		return details;

	}

	@Bean
	public ExceptionResponse excepResp() {
		
		return new ExceptionResponse();
	}
}
