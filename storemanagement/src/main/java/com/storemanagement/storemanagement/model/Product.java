package com.storemanagement.storemanagement.model;

import java.sql.Date;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "Product")
public class Product {
	@Id
	private int product_id;

	@Column(name = "productName")
	private String product_name;
	@Column(name = "manufacturedDate")
	private Date manufactured_date;
	@Column(name = "expiryDate")
	private Date expiry_date;
	@Column(name = "price")
	private int price;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "category_id")
	Category category;

	@OneToMany(mappedBy = "product", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	List<BillDetails> billdetail;

	public List<BillDetails> getBilldetail() {
		return billdetail;
	}

	public void setBilldetail(List<BillDetails> billdetail) {
		this.billdetail = billdetail;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public Date getManufactured_date() {
		return manufactured_date;
	}

	public void setManufactured_date(Date manufactured_date) {
		this.manufactured_date = manufactured_date;
	}

	public Date getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(Date expiry_date) {
		this.expiry_date = expiry_date;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}	

