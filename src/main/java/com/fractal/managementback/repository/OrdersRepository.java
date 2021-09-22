package com.fractal.managementback.repository;



import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

import com.fractal.managementback.model.Orders;

@Repository
public interface OrdersRepository extends MongoRepository<Orders, String>{
	
}
