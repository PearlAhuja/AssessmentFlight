package com.example.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	int flight_id;
	String airline;
	String source, destination;
	String start_date, end_date;
	String start_time, end_time;
	int noOfBusinessClassSeats;
	int noOfEconomyClassSeats;
	int noOfRows;
	float costOfBusinessClassSeats;
	float costOfEconomyClassSeats;

	public int getFlight_id() {
		return flight_id;
	}

	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}



	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}


	public int getNoOfBusinessClassSeats() {
		return noOfBusinessClassSeats;
	}

	public void setNoOfBusinessClassSeats(int noOfBusinessClassSeats) {
		this.noOfBusinessClassSeats = noOfBusinessClassSeats;
	}

	public int getNoOfEconomyClassSeats() {
		return noOfEconomyClassSeats;
	}

	public void setNoOfEconomyClassSeats(int noOfEconomyClassSeats) {
		this.noOfEconomyClassSeats = noOfEconomyClassSeats;
	}

	public int getNoOfRows() {
		return noOfRows;
	}

	public void setNoOfRows(int noOfRows) {
		this.noOfRows = noOfRows;
	}
	public float getCostOfBusinessClassSeats() {
		return costOfBusinessClassSeats;
	}
	public void setCostOfBusinessClassSeats(float costOfBusinessClassSeats) {
		this.costOfBusinessClassSeats = costOfBusinessClassSeats;
	}
	public float getCostOfEconomyClassSeats() {
		return costOfEconomyClassSeats;
	}
	public void setCostOfEconomyClassSeats(float costOfEconomyClassSeats) {
		this.costOfEconomyClassSeats = costOfEconomyClassSeats;
	}

}


