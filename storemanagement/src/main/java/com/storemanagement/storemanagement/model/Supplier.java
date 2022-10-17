package com.storemanagement.storemanagement.model;

import javax.persistence.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Supplier")
public class Supplier  {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int supplier_id;
	@Column(name="supplierName")
	private String supplier_name;
	@Column(name="mobileNo")
	private String mobile_no;
	@OneToOne(mappedBy = "suppliers" , fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	Company company;

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public int getSupplier_id() {
		return supplier_id;
	}

	public void setSupplier_id(int supplier_id) {
		this.supplier_id = supplier_id;
	}

	public String getSupplier_name() {
		return supplier_name;
	}

	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

}
