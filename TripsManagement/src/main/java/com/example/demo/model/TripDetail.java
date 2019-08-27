package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TripDetail {

	private long tripId;
	private String source;
	private String destination;
	private double amount;
	
	
}
