package com.bsale.airline.model;



import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="boarding_pass")
public class BoardingPass { 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "boarding_pass_id")
	private Long boardingPassId;
	
	@ManyToOne( cascade = CascadeType.ALL)
	@JoinColumn(name = "purchase_id")
	private Purchase purchase; 
	
	@OneToOne(cascade = CascadeType.ALL )
	@JoinColumn(name="passenger_id" )
	@JsonManagedReference
	private Passenger passenger;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "seat_type_id")
	private SeatType seatType;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "seat_id")
	private Seat seat;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "flight_id")
	private Flight flight;

	public BoardingPass(Long boardingPassId, Purchase purchase, Passenger passenger, SeatType seatType, Seat seat,
			Flight flight) {
		super();
		this.boardingPassId = boardingPassId;
		this.purchase = purchase;
		this.passenger = passenger;
		this.seatType = seatType;
		this.seat = seat;
		this.flight = flight;
	}

	public BoardingPass() {
		super();
	}

	public Long getBoardingPassId() {
		return boardingPassId;
	}

	public void setBoardingPassId(Long boardingPassId) {
		this.boardingPassId = boardingPassId;
	}

	public Purchase getPurchase() {
		return purchase;
	}

	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public SeatType getSeatType() {
		return seatType;
	}

	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}


	
	

}
