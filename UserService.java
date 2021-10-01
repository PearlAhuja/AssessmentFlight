package com.example.demo;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepository repository;
	@Autowired
	FlightRepository frepository;

	public void Save(User user) {
		repository.save(user);
		System.out.println("---------SAVED-------");
	}

	
	public void getDetails(int pnr)
	{
		repository.findById(pnr);
	}
	public int generatePnr() {
		 Random rand = new Random();
	     int pnr = rand.nextInt(1000);
	     System.out.println("Pnr Service  : "+pnr);
	     return pnr;
	}
}
