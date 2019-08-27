package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.model.Passenger;
import com.example.demo.services.PassengerService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class PassengerController {

	
	@Autowired
	private PassengerService service;
	
	
	@GetMapping("/passenger")
	public ResponseEntity<Iterable<Passenger>> findAll(){
		
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.CACHE_CONTROL, "no-cache");

		return ResponseEntity.ok()
					   .headers(headers)
					   .body(this.service.findAll());

		
	}
	
	

	@GetMapping("/passenger/{id}")
	public Passenger findById(@PathVariable("id") Long id,@RequestHeader Map<String, String> headers){
		
		headers.forEach((key, value) -> {
		log.info(String.format("Header '%s' = %s", key, value));
			});

		
		return this.service.findById(id);

	}

	

	@PostMapping(path="/passenger",produces="application/json",consumes="application/json")
	@ResponseStatus(code=HttpStatus.CREATED)
	public Passenger insert(@RequestBody Passenger pass) {
		
		return this.service.addPassenger(pass);
	}
	
	
//	@DeleteMapping("/passenger")
//	public Passenger remove(@RequestBody Passenger entity) throws DataNotFoundException {
//		
//		Passenger resp=this.service.remove(entity);
//		
//		if(resp==null) {
//			
//			throw new DataNotFoundException(entity.getId() + " Data Not Found");
//		}
//		return resp;
//	}
//	
	
	@DeleteMapping("/passenger")
	public Passenger remove(@RequestBody Passenger entity) throws ResponseStatusException {
		
		Passenger resp=this.service.remove(entity);
		
		if(resp==null) {
			
			try {
				resp=new Passenger();

				throw new DataNotFoundException(entity.getId() + " Data Not Found");
			} catch (DataNotFoundException ex) {
				
				throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Need Correct Entity",ex);
			}
		}
		return resp;
	}
	
	@PutMapping("/passenger")
	public Passenger update(@RequestBody Passenger entity) {
		
		return this.service.update(entity);
		
	}
}
