package com.ecommerce.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.app.entity.Price;

@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {
}
