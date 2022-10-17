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
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int employee_id;
	@Column(name="employeeName")
	private String employee_name;
	@Column(name="doj")
	private Date doj;
	@Column(name="salary")
	private int salary;
	@Column(name="designation")
	private String designation;
	@Column(name="mobileNo")
	private String mobile_number;
	@Column(name="address")
	private String address;
	@Column(name="dateOfBirth")
	private String dateOfBirth;
	@OneToMany(mappedBy = "employee" ,fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	List <Bill> bills;

	public List<Bill> getBills() {
		return bills;
	}

	public void setBills(List<Bill> bills) {
		this.bills = bills;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		dateOfBirth = dateOfBirth;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
