package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {

	@Autowired
	FlightRepository repository;



	public void Save(Flight flight) {
		repository.save(flight);
		System.out.println("---------SAVED-------");
		
	}

}
