package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Passenger;
import com.example.demo.services.PassengerService;

@RestController
public class PassengerController {

	
	@Autowired
	private PassengerService service;
	
	
	@GetMapping("/showAll")
	public List<Passenger> findAll(){
		
		return this.service.findAll();
	}
	
	

	@GetMapping("/showAll/{id}")
	public Passenger findById(@PathVariable("id") Long id){
		
		return this.service.findById(id);

	}
	

	@PostMapping(path="/add",produces="application/json",consumes="application/json")
	@ResponseStatus(code=HttpStatus.CREATED)
	public Passenger insert(@RequestBody Passenger pass) {
		
		return this.service.addPassenger(pass);
	}
	
}
