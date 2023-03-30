package com.bsale.airline.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "passenger")
public class Passenger  { 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="passenger_id")
	private Long passengerId;
	
	@Column(length = 255)
	private String dni;
	@Column(length = 255)
	private String name;
	@Column
	private int age;
	@Column(length = 255)
	private String country;

	@OneToOne(mappedBy = "passenger" )
	@JsonBackReference //evita recursion 
	private BoardingPass boardingPass; 
	
	
	public Passenger(String dni, String name, int age, String country, BoardingPass boardingPass) {
		super();
		this.dni = dni;
		this.name = name;
		this.age = age;
		this.country = country;
		this.boardingPass = boardingPass;
	}

	public Passenger(Long passengerId, String dni, String name, int age, String country, BoardingPass boardingPass) {
		super();
		this.passengerId = passengerId;
		this.dni = dni;
		this.name = name;
		this.age = age;
		this.country = country;
		this.boardingPass = boardingPass;
	}

	public Passenger() {
		super();
	}

	
	public Long getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(Long passengerId) {
		this.passengerId = passengerId;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public BoardingPass getBoardingPass() {
		return boardingPass;
	}



	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", dni=" + dni + ", name=" + name + ", age=" + age
				+ ", country=" + country + ", boardingPass=" + boardingPass + "]";
	}


	
	
}
