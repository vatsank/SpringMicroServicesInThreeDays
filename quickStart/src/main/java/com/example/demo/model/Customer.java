package com.example.demo.model;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;


// @Component - Annotation based configuration

//@Scope("prototype")
//@Scope(scopeName=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Lazy
@Slf4j
@ToString
public class Customer {

			
	private long customerId ;
	private String customerName;
	private double amountDue;
	
	@Autowired
	private Address address;
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Customer() {
		super();
		log.info("Object Initialized");
	}

	public Customer(long customerId, String customerName, double amountDue) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.amountDue = amountDue;
		
		System.out.println(this);
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		log.info("========= CUSTOMER ID CALLED =====");
		
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		
		log.info("========= CUSTOMER NAME CALLED =====");

		this.customerName = customerName;
	}

	public double getAmountDue() {
		

		return amountDue;
	}

	public void setAmountDue(double amountDue) {
		
		log.info("========= AMOUNT CALLED =====");

		this.amountDue = amountDue;
	}
	
	
	
}
