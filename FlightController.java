package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/api/v1.0")
public class FlightController {
	
	@Autowired
	FlightService flightService;
	@PostMapping
	
    void  saveUser(@RequestBody Flight flight ) {//create user
		flightService.Save(flight);
		System.out.println("-------- Flight Details ----");
	
		System.out.println("Flight Id : "+ flight.getFlight_id());
		System.out.println("Source : "+flight.getSource());
		System.out.println("Destination : "+flight.getDestination());
		System.out.println("Start Time : "+flight.getStart_time());
		System.out.println("Destination Time : "+flight.getStart_time());
		System.out.println("No. Of Business Class Seats : "+flight.getCostOfBusinessClassSeats());
		System.out.println("No.Of Non Economy Class Seats :  "+ flight.noOfEconomyClassSeats);
		System.out.println(" Cost of Business Class Seat :"+ flight.getCostOfBusinessClassSeats());
		System.out.println(" Cost of Economy Class Seat :"+ flight.getCostOfEconomyClassSeats());
		
	  
	
	}
	
  
}
