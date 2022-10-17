package com.storemanagement.storemanagement.model;

import java.sql.Date;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Bill")
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bill_no;
	@Column(name = "totalAmount")
	private int total_amount;
	@Column(name = "billDate")
	private Date bill_date;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "employeeId")
	Employee employee;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "CustomerId")
	Customer customer;
	
	@OneToMany(mappedBy = "bill" , fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	List<BillDetails> billdetails;
	
	public List<BillDetails> getBilldetails() {
		return billdetails;
	}

	public void setBilldetails(List<BillDetails> billdetails) {
		this.billdetails = billdetails;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getBill_no() {
		return bill_no;
	}

	public void setBill_no(int bill_no) {
		this.bill_no = bill_no;
	}

	public int getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(int total_amount) {
		this.total_amount = total_amount;
	}

	public Date getBill_date() {
		return bill_date;
	}

	public void setBill_date(Date bill_date) {
		this.bill_date = bill_date;
	}

}
