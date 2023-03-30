package com.bsale.airline.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bsale.airline.model.Passenger;

@Repository
public interface PassengerRepository extends CrudRepository<Passenger, Long>{

}
