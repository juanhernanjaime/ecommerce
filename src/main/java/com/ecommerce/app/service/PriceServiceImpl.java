package com.ecommerce.app.service;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.app.entity.Price;
import com.ecommerce.app.repository.PriceRepository;

import reactor.function.Predicate;

@Service
public class PriceServiceImpl implements IPriceService {

	@Autowired
	ModelMapper modelMapper;

	@Autowired
	private PriceRepository priceRepository;

	@Override
	public Optional<Price> getPriceByProduct(final Date fechaAplicacion, final Long identificadorProducto,
			final Long identificadorCadena) {
		Predicate<Price> pricePredicate = (price) -> fechaAplicacion.after(price.getStartDate())
				&& fechaAplicacion.before(price.getEndDate()) && price.getBrand().getId() == identificadorCadena
				&& price.getProduct().getId() == identificadorProducto;

		Optional<Price> opt = priceRepository. //
				findAll()//
				.stream()//
				.filter(pricePredicate::test)//
				.sorted(Comparator.comparing(Price::getPriority))//
				.findFirst();//

		System.out.println(opt);
		return opt;
	}

}
