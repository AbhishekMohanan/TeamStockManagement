package com.storemanagement.storemanagement.model;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int customer_id;
	@Column(name="customerName")
	private String customer_name;
	@Column(name="mobileNo")
	private String mobile_no;
	@OneToMany (mappedBy = "customer" ,fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	List<Bill> bills;
	public List<Bill> getBills() {
		return bills;
	}

	public void setBills(List<Bill> bills) {
		this.bills = bills;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

}
