package com.bsale.airline.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bsale.airline.dto.FlightDTO;
import com.bsale.airline.dto.PassengersDTO;
import com.bsale.airline.mapper.PassengersMapper;
import com.bsale.airline.model.Flight;
import com.bsale.airline.model.Passenger;

import com.bsale.airline.repository.FlightRepository;
import com.bsale.airline.repository.PassengerRepository;

@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	FlightRepository flightRepository;

	@Autowired
	PassengerRepository passengerRepository;

	@Autowired
	PassengersMapper passengersMapper;
	

	public static final String FIELD_WITH_ID = "Field with id = ";
	public static final String DOES_NOT_EXIST = " does not exist.";

	private List<PassengersDTO> findByIdPassengerAndFlight(Flight flightById ) {

		List<Passenger> passengersList = (List<Passenger>) passengerRepository.findAll();

		List<PassengersDTO> passengersListDTO = new ArrayList<>();

		for (Passenger passenger : passengersList) {

			if (passenger.getBoardingPass().getFlight().getFlightId().equals(flightById.getFlightId())) {// match by id
				PassengersDTO passengersDTO = passengersMapper.toDTO(passenger);

				passengersListDTO.add(passengersDTO);
			}
		}

		return passengersListDTO;
	}

	@Override
	public FlightDTO findByIdWithPassengersList(Long id) {

		Boolean exists = flightRepository.existsById(id);
		if (!exists) {
			new NoSuchElementException(FIELD_WITH_ID + id + DOES_NOT_EXIST);
		}

		Flight flightById = flightRepository.findById(id).get();// return optional

		FlightDTO flightDTO = new FlightDTO();
		flightDTO.setFlightId(flightById.getFlightId());
		flightDTO.setTakeoffDateTime(flightById.getTakeoffDateTime());
		flightDTO.setTakeoffAirport(flightById.getTakeoffAirport());
		flightDTO.setLandingDateTime(flightById.getLandingDateTime());
		flightDTO.setLandingAirport(flightById.getLandingAirport());
		flightDTO.setAirplaneId(flightById.getFlightId());

		List<PassengersDTO> passengersListDTO = findByIdPassengerAndFlight(flightById);// match by id
		flightDTO.setPassengers(passengersListDTO);

		return flightDTO;
	}

}
