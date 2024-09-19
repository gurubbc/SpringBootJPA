package com.ofss;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// Model layer
@Entity
// This represents there is a corresponding db table customers
// This is no more called as POJO, but it is now an entity class
public class Customers {
	@Id
	int id;
	String firstName; // FIRST_NAME
	String lastName; // LAST_NAME
	long phoneNumber; // PHONE_NUMBER
	String emailId; // EMAIL_ID
	
	// default constructor
	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor
	public Customers(int id, String firstName, String lastName, long phoneNumber, String emailId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
	}

	// Generate the required setter and getter methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}
