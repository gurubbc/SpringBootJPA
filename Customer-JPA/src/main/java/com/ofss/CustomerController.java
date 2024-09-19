package com.ofss;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// controller layer
@RestController
public class CustomerController {

	// Let's inject the CustomerService object here, there is a special annotation
	// for this

	@Autowired
	CustomerService customerService;

	public CustomerController() {

	}

	// Flow
	// Client --> Controller --> Service --> Repsitory --> oracle db table
	
	// List of customer
	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public List<Customers> getAllCustomers() {
		return customerService.fetchAllCustomers();
	}
	
	

	// API 3: Adding a new customer object to existing allCustomers ArrayList
	@RequestMapping(value = "/customers", method = RequestMethod.POST)
	public ResponseEntity<?> addCustomer(@RequestBody Customers newCustomer) {
		Random random=new Random();
		int customerId=random.nextInt(100);
		newCustomer.setId(customerId);
		return customerService.insertCustomer(newCustomer);
	}

	
}
