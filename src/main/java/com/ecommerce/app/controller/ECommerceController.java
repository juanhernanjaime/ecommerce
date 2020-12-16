package com.ecommerce.app.controller;

import java.util.Date;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.app.dto.PriceDTO;
import com.ecommerce.app.entity.Price;
import com.ecommerce.app.exceptions.PriceNotFoundException;
import com.ecommerce.app.service.IPriceService;

@RestController
@RequestMapping("/ecommerce")
public class ECommerceController {

	@Autowired
	IPriceService priceService;

	@Autowired
	ModelMapper modelMapper;

	@GetMapping("/price")
	public ResponseEntity<PriceDTO> getPriceByProduct(
			@RequestParam(required = true, value = "fechaAplicacion") @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ") Date fechaAplicacion,
			@RequestParam(required = true) Long identificadorProducto,
			@RequestParam(required = true) Long identificadorCadena) throws PriceNotFoundException {
		Optional<Price> priceOptional = priceService.getPriceByProduct(fechaAplicacion, identificadorProducto,
				identificadorCadena);
		if (priceOptional.isPresent()) {
			return ResponseEntity.ok().body(modelMapper.map(priceOptional.get(), PriceDTO.class));
		}
		throw new PriceNotFoundException();
	}

}
