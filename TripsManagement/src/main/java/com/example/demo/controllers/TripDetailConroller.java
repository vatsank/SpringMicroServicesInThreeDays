package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.TripDetail;
import com.example.demo.services.TripDetailService;

@RestController
public class TripDetailConroller {

	
	@Autowired
	private TripDetailService service;
	
	@GetMapping("/showDetail")
	public TripDetail getDetail() {
		
		return this.service.getDetail();
	}
	
}
