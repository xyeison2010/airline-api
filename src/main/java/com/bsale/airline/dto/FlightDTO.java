package com.bsale.airline.dto;

import java.util.List;

public class FlightDTO {

	private Long flightId;
	private int takeoffDateTime;
	private String takeoffAirport;
	private int landingDateTime;
	private String landingAirport;

	private Long airplaneId;
	private List<PassengersDTO> passengers;

	public FlightDTO(Long flightId, int takeoffDateTime, String takeoffAirport, int landingDateTime,
			String landingAirport, Long airplaneId, List<PassengersDTO> passengers) {
		super();
		this.flightId = flightId;
		this.takeoffDateTime = takeoffDateTime;
		this.takeoffAirport = takeoffAirport;
		this.landingDateTime = landingDateTime;
		this.landingAirport = landingAirport;
		this.airplaneId = airplaneId;
		this.passengers = passengers;
	}

	public FlightDTO() {
		super();
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

	public Long getAirplaneId() {
		return airplaneId;
	}

	public void setAirplaneId(Long airplaneId) {
		this.airplaneId = airplaneId;
	}

	public List<PassengersDTO> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<PassengersDTO> passengers) {
		this.passengers = passengers;
	}

}
