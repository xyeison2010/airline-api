package com.bsale.airline.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bsale.airline.model.Flight;

@Repository
public interface FlightRepository extends CrudRepository<Flight, Long> {

}
