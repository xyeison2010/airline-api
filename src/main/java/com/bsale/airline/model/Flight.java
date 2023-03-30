package com.bsale.airline.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;

@Entity
@Table(name = "flight")
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "flight_id")
	private Long flightId;
	
	@Column(name = "takeoff_date_time")
	private int takeoffDateTime;
	
	@Column(name = "takeoff_airport" , length = 255)
	private  String takeoffAirport;
	
	@Column(name = "landing_date_time")
	private int landingDateTime;
	
	@Column(name = "landing_airpot" , length = 255)
	private String landingAirport;

	@ManyToOne//@JsonBackReference
	@JoinColumn(name="airplane_id" ) 
	private Airplane airplaneId ; 


	public Flight() {
		super();
	}

	public Flight(Long flightId, int takeoffDateTime, String takeoffAirport, int landingDateTime, String landingAirport,
			Airplane airplaneId) {
		super();
		this.flightId = flightId;
		this.takeoffDateTime = takeoffDateTime;
		this.takeoffAirport = takeoffAirport;
		this.landingDateTime = landingDateTime;
		this.landingAirport = landingAirport;
		this.airplaneId = airplaneId;
	}

	public Long getFlightId() {
		return flightId;
	}

	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}

	public int getTakeoffDateTime() {
		return takeoffDateTime;
	}

	public void setTakeoffDateTime(int takeoffDateTime) {
		this.takeoffDateTime = takeoffDateTime;
	}

	public String getTakeoffAirport() {
		return takeoffAirport;
	}

	public void setTakeoffAirport(String takeoffAirport) {
		this.takeoffAirport = takeoffAirport;
	}

	public int getLandingDateTime() {
		return landingDateTime;
	}

	public void setLandingDateTime(int landingDateTime) {
		this.landingDateTime = landingDateTime;
	}

	public String getLandingAirport() {
		return landingAirport;
	}

	public void setLandingAirport(String landingAirport) {
		this.landingAirport = landingAirport;
	}

	public Airplane getAirplaneId() {
		return airplaneId;
	}

	public void setAirplaneId(Airplane airplaneId) {
		this.airplaneId = airplaneId;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", takeoffDateTime=" + takeoffDateTime + ", takeoffAirport="
				+ takeoffAirport + ", landingDateTime=" + landingDateTime + ", landingAirport=" + landingAirport
				+ ", airplaneId=" + airplaneId + "]";
	}

	
	

}
