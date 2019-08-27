package com.example.demo.services;

import javax.validation.constraints.Email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.TripDetail;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Service
@NoArgsConstructor
@Getter
@Setter
public class TripDetailService {

	
	@Autowired
	private TripDetail detail;
	
	
	public TripDetail getDetail() {
		
		return detail;
	}
	
	
}
