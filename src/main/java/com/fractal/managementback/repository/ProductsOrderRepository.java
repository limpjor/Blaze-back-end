package com.fractal.managementback.repository;



import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

import com.fractal.managementback.model.ProductsOrder;

@Repository
public interface ProductsOrderRepository extends MongoRepository<ProductsOrder, String>{
	List <ProductsOrder> findByOrderNumber (String orderNumber);
	
}
