package com.example.demo.config;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Customer;
import com.example.demo.model.CustomerList;

@Configuration
public class AppConfig {

	@Bean   // java based configuration
	public Customer customer() {
		
		return new Customer(100,"Shyam",6202);
	}
	
	@Bean
	public Customer ramesh() {
		
		return new Customer(101,"Ramesh",4500);
	}
	
	@Bean
	public Customer rakesh() {
		
		return new Customer(102,"Rakesh",5500);
	}
	
	@Bean
	public Customer rajesh() {
		
		return new Customer(103,"Rajesh",6500);
	}
	
	
	@Bean
	public CustomerList custList() {
		
		return new CustomerList();
	}
	
	@Bean
	public Map<Long,Customer> custDetails(){
		
		
		List<Customer> custList =custList().getCustList();
		
        Map<Long, Customer> map = custList.stream().collect(
                Collectors.toMap(Customer::getCustomerId, Function.identity()));

		
		return map;
	}
	
}



 
 