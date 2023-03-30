package com.bsale.airline.service;



import com.bsale.airline.dto.FlightDTO;


public interface FlightService {

	FlightDTO findByIdWithPassengersList(Long id);

}
