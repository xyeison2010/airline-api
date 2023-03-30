package com.bsale.airline.mapper;


import com.bsale.airline.dto.PassengersDTO;
import com.bsale.airline.model.Passenger;

public interface PassengersMapper {

	PassengersDTO toDTO (Passenger entity);
	
	//Passenger fromDTO (PassengersListDTO entityDTO);



}
