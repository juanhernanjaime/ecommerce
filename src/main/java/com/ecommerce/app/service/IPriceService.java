package com.ecommerce.app.service;

import java.util.Date;
import java.util.Optional;

import com.ecommerce.app.entity.Price;

public interface IPriceService {

	Optional<Price> getPriceByProduct(Date fechaAplicacion, Long identificadorProducto, Long identificadorCadena);

}
