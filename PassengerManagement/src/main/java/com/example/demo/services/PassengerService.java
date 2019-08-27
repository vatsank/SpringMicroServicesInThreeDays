package com.example.demo.services;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.model.Passenger;
import com.example.demo.repos.PassengerRepository;

@Service
public class PassengerService {

	@Autowired
	private PassengerRepository repo;
	@Autowired
	private HashMap<Long,Passenger> details;

	
	// private HashMap<Long,Passenger> details;

	public PassengerService() {
		super();
		
	}
	
	
	
//	public PassengerService(@Autowired Passenger ram, @Autowired Passenger shyam) {
//		
//		details.put(101L, ram);
//		details.put(102L, shyam);
//		
//	}
	

	public Passenger addPassenger(Passenger object)  {
		
		
		Passenger status = details.get(object.getId());
		
		Passenger response =null;
		
		if(status ==null) {
		
			details.put(object.getId(), object);
			
			response = object;
		} 		
		return response;
	}
	
	public Passenger findById(long id) {
		
		return details.get(id);
	}
	
	public List<Passenger> findAll(){
		
		System.out.println(details);
		List<Passenger> list = this.details.entrySet().stream().
				 map(eachElement -> eachElement.getValue()).
				        collect(Collectors.toList());
		
		System.out.println(list);
		return list;
	}
}
