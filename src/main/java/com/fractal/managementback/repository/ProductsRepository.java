package com.fractal.managementback.repository;



import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

import com.fractal.managementback.model.Products;

@Repository
public interface ProductsRepository extends MongoRepository<Products, String>{
	
}
