package com.example.demo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class Address {

	
	@Value("Gandhi Street")
	private String addressLine1;
	@Value("Nehru Nagar")
	private String addressLine2;
	@Value("Chennai")
	private String city;
	@Value("600117")
	private long pinCode;
	
}
