package com.ofss;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customers, Integer>{
	// leave it blank, based on the entity class,
	// JpaRepository will generate all the CRUD methods
}
