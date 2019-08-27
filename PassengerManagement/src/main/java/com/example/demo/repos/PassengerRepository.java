package com.example.demo.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger, Long> {

}
