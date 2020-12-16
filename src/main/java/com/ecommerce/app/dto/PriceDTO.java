package com.ecommerce.app.dto;

import java.util.Date;

import com.ecommerce.app.entity.Brand;
import com.ecommerce.app.entity.Product;

public class PriceDTO {

	// identificador de producto,
	// identificador de cadena,
	// tarifa a aplicar,
	// fechas de aplicación
	// precio final a aplicar.

	private Long id;
	private Long brandID;
	private Date startDate;
	private Date endDate;
	private String priceList;
	private Long productId;
	private Integer priority;
	private Double price;
	private String curr;

	public PriceDTO() {
	}

	public PriceDTO(Long id, Long brandID, Date startDate, Date endDate, String priceList, Long productId,
			Integer priority, Double price, String curr) {
		this.id = id;
		this.brandID = brandID;
		this.startDate = startDate;
		this.endDate = endDate;
		this.priceList = priceList;
		this.productId = productId;
		this.priority = priority;
		this.price = price;
		this.curr = curr;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBrandID() {
		return brandID;
	}

	public void setBrandID(Long brandID) {
		this.brandID = brandID;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getPriceList() {
		return priceList;
	}

	public void setPriceList(String priceList) {
		this.priceList = priceList;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}

}
