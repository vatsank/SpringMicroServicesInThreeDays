package com.example.demo.model;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerList {

	@Autowired
	private List<Customer> custList;
	@Autowired
	private Map<Long,Customer> custDetails;
	
}
