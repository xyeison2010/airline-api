package com.bsale.airline.exception;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.RestControllerAdvice;

import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * Este componente permite declarar excepciones personalizadas, con el
 * HttpStatus para cada una de esas excepciones
 */
@RestControllerAdvice
public class ResponseHandler extends ResponseEntityExceptionHandler {

	public static ResponseEntity<Object> generateResponse(HttpStatus status, Object responseObj) {
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("data", responseObj);
		map.put("code", status.value());

		return new ResponseEntity<Object>(map, status);

	}

	@ExceptionHandler(NoSuchElementException.class)
	public final ResponseEntity<Object> handleNotFound() {
		Map<String, Object> map = new HashMap<>();

		map.put("data", new HashMap<Object, Object>());
		map.put("code", HttpStatus.NOT_FOUND.value());

		return new ResponseEntity<>(map, HttpStatus.NOT_FOUND); // error 404
	}

	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public final ResponseEntity<Object> handleMatchn() {
		Map<String, Object> map = new HashMap<>();
		map.put("errors", "could not connect to db");
		map.put("code", HttpStatus.BAD_REQUEST.value());

		return new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);// error 400
	}

	@ExceptionHandler(RuntimeException.class)
	public final ResponseEntity<Object> handleInternal() {
		Map<String, Object> map = new HashMap<>();
		map.put("errors", "could not connect to db");
		map.put("code", HttpStatus.BAD_REQUEST.value());
		return new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
	}

}
