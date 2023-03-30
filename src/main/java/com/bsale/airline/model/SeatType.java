package com.bsale.airline.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "seat_type")
public class SeatType {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "seat_type_id")
private Long id;

@Column(length = 255)
private String name;

public SeatType() {
	super();
}

public SeatType(Long id, String name) {
	super();
	this.id = id;
	this.name = name;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "SeatType [id=" + id + ", name=" + name + "]";
}



}
