package com.ecommerce.app.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.ecommerce.app.exceptions.PriceNotFoundException;

@ControllerAdvice
public class ECommerceAdviceController {

	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public ResponseEntity<?> methodArgumentTypeMismatchExceptionHandler() {
		return ResponseEntity.badRequest().header("error", "Formato de fecha inválido")
				.contentType(MediaType.APPLICATION_JSON).build();
	}

	@ExceptionHandler(PriceNotFoundException.class)
	public ResponseEntity<?> priceNotFoundExceptionHandler() {
		return ResponseEntity.noContent().header("error", "No hay resultados para la consulta").build();
	}
}
