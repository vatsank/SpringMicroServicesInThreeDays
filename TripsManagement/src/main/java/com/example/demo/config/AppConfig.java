package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.TripDetail;

@Configuration
public class AppConfig {

	
	@Bean
	public TripDetail detail() {
		
		return new TripDetail(102, "silkboard", "hope form", 5600);
	}
	
}
