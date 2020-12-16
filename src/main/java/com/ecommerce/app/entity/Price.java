package com.ecommerce.app.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "PRICES")
public class Price implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(columnDefinition = "BRAND_ID")
	private Brand brand;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "START_DATE")
	private Date startDate;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "END_DATE")
	private Date endDate;
	@Column(name = "PRICE_LIST")
	private String priceList;
	@ManyToOne
	@JoinColumn(columnDefinition = "PRODUCT_ID")
	private Product product;
	@Column(name = "PRIORITY")
	private Integer priority;
	@Column(name = "PRICE")
	private Double price;
	@Column(name = "CURR")
	private String curr;

	public Price() {
	}

	public Price(Brand brand, Date startDate, Date endDate, String priceList, Product product, Integer priority,
			Double price, String curr) {
		this.brand = brand;
		this.startDate = startDate;
		this.endDate = endDate;
		this.priceList = priceList;
		this.product = product;
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

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
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

	@Override
	public String toString() {
		return "Price [id=" + id + ", brand=" + brand + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", priceList=" + priceList + ", product=" + product + ", priority=" + priority + ", price=" + price
				+ ", curr=" + curr + "]";
	}

}
