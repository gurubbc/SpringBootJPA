package com.ofss;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

// View layer
// in REST API, the service layer is responsible for creating the dataset
@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRespository;

	public CustomerService() {
		
	}

	public ResponseEntity<String> insertCustomer(Customers newCustomer) {
		// if customer id exists, then return error
		// else save the customer
		if (customerRespository.existsById(newCustomer.getId())) {
			return ResponseEntity.status(HttpStatus.CONFLICT).body("Customer id already exists");
		}
		
		
		customerRespository.save(newCustomer);// will generate the SQL insert query
		return ResponseEntity.status(HttpStatus.CREATED).body("Customer added successfully with id: " + newCustomer.getId());
	}

	// add method for fetch all customers
	public List<Customers> fetchAllCustomers() {
		return customerRespository.findAll(); // select * from customers;
	}
	
	
	// add method for delete customer
	
	// add method for update customer
	
}
