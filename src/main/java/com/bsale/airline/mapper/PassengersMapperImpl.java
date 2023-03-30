package com.bsale.airline.mapper;

import org.springframework.stereotype.Component;

import com.bsale.airline.dto.PassengersDTO;
import com.bsale.airline.model.Passenger;;

@Component
public class PassengersMapperImpl implements PassengersMapper {

	@Override
	public PassengersDTO toDTO(Passenger entity) {
		if (entity == null) {
			return null;
		}
		PassengersDTO passengersDTO = new PassengersDTO();
		passengersDTO.setPassengerId(entity.getPassengerId());
		passengersDTO.setDni(entity.getDni());
		passengersDTO.setName(entity.getName());
		passengersDTO.setAge(entity.getAge());
		passengersDTO.setCountry(entity.getCountry());
		passengersDTO.setBoardingPassId(entity.getBoardingPass().getBoardingPassId());
		passengersDTO.setPurchaseId(entity.getBoardingPass().getPurchase().getId());
		passengersDTO.setSeatTypeId(entity.getBoardingPass().getSeatType().getId());
		passengersDTO.setSeatId(entity.getBoardingPass().getSeat().getId());

		return passengersDTO;
	}

}
