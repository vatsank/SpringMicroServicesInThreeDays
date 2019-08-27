package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Passenger;
import com.example.demo.services.PassengerService;

@RestController
public class PassengerController {

	
	@Autowired
	private PassengerService service;
	
	
	@GetMapping("/passenger")
	public Iterable<Passenger> findAll(){
		
		return this.service.findAll();
	}
	
	

	@GetMapping("/passenger/{id}")
	public Passenger findById(@PathVariable("id") Long id){
		
		return this.service.findById(id);

	}
	

	@PostMapping(path="/passenger",produces="application/json",consumes="application/json")
	@ResponseStatus(code=HttpStatus.CREATED)
	public Passenger insert(@RequestBody Passenger pass) {
		
		return this.service.addPassenger(pass);
	}
	
	
	@DeleteMapping("/passenger")
	public Passenger remove(@RequestBody Passenger entity) throws DataNotFoundException {
		
		Passenger resp=this.service.remove(entity);
		
		if(resp==null) {
			
			throw new DataNotFoundException(entity.getId() + " Data Not Found");
		}
		return resp;
	}
	
	@PutMapping("/passenger")
	public Passenger update(@RequestBody Passenger entity) {
		
		return this.service.update(entity);
		
	}
}
