package com.bsale.airline.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;

@Entity
@Table(name = "seat")
public class Seat {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "seat_id")
private Long id;	

@Column(name = "seat_column" ,length = 2)
private String seatColumn;

@Column(name = "seat_row")
private int seatRow;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name= "seat_type_id" , referencedColumnName = "seat_type_id")
private SeatType seatTypeId; 

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name="airplane_id" , referencedColumnName = "airplane_id")
private Airplane airplaneId;

public Seat() {
	super();
}

public Seat(Long id, String seatColumn, int seatRow, SeatType seatTypeId, Airplane airplaneId) {
	super();
	this.id = id;
	this.seatColumn = seatColumn;
	this.seatRow = seatRow;
	this.seatTypeId = seatTypeId;
	this.airplaneId = airplaneId;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getSeatColumn() {
	return seatColumn;
}

public void setSeatColumn(String seatColumn) {
	this.seatColumn = seatColumn;
}

public int getSeatRow() {
	return seatRow;
}

public void setSeatRow(int seatRow) {
	this.seatRow = seatRow;
}

public SeatType getSeatTypeId() {
	return seatTypeId;
}

public void setSeatTypeId(SeatType seatTypeId) {
	this.seatTypeId = seatTypeId;
}

public Airplane getAirplaneId() {
	return airplaneId;
}

public void setAirplaneId(Airplane airplaneId) {
	this.airplaneId = airplaneId;
}

@Override
public String toString() {
	return "Seat [id=" + id + ", seatColumn=" + seatColumn + ", seatRow=" + seatRow + ", seatTypeId=" + seatTypeId
			+ ", airplaneId=" + airplaneId + "]";
}






}
