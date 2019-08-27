package com.example.demo.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Passenger;

@Repository
public interface PassengerRepository extends CrudRepository<Passenger, Long> {

}
