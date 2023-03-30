package com.bsale.airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bsale.airline.dto.FlightDTO;
import com.bsale.airline.exception.ResponseHandler;
import com.bsale.airline.service.FlightService;

@RestController
@CrossOrigin  //Esta anotacion permite llamadas desde cualquier origen, 
@RequestMapping("springairline/api/v1/flights")
public class FlightController {

	@Autowired
	FlightService flightService;

	//for unit tests
	public FlightController(FlightService flightService) {
		this.flightService = flightService;
	}



	@GetMapping("/{id}/passengers")
	public ResponseEntity<Object> listFlightWithPassengerList(@PathVariable Long id) {

		FlightDTO flightDTO = flightService.findByIdWithPassengersList(id);

		return ResponseHandler.generateResponse(HttpStatus.OK, flightDTO);


	}

}
