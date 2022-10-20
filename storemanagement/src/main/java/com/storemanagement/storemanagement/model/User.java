package com.storemanagement.storemanagement.model;


import javax.persistence.*;



@Entity
@Table(name = "LoginPage")
public class User {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int personId;
	    
	    private String roles;   
	    
	    private String userName;
	    private String emailId;
	    private String passwords;
	    private String address;
	    private long contactNumber;
	    
	    
	    public int getPersonId() {
			return personId;
		}
		public void setPersonId(int personId) {
			this.personId = personId;
		}
		public String getRoles() {
			return roles;
		}
		public void setRoles(String roles) {
			this.roles = roles;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public String getPasswords() {
			return passwords;
		}
		public void setPasswords(String passwords) {
			this.passwords = passwords;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public long getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(long contactNumber) {
			this.contactNumber = contactNumber;
		}
		public boolean isActive() {
			return active;
		}
		public void setActive(boolean active) {
			this.active = active;
		}
		private boolean active;
	 
	}

	

