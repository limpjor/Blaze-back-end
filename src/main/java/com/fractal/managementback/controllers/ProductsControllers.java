package com.fractal.managementback.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fractal.managementback.model.Products;
import com.fractal.managementback.model.ProductsOrder;
import com.fractal.managementback.repository.ProductsOrderRepository;
import com.fractal.managementback.repository.ProductsRepository;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,RequestMethod.DELETE })
@RequestMapping("/api/products")
public class ProductsControllers {
	
	@Autowired
	private ProductsRepository product;
	
	@Autowired
	private ProductsOrderRepository productsOrder;
	
	@PostMapping("/insert")
	public Products create(@Validated @RequestBody Products products) {
		return product.insert(products);
	}
	
	@GetMapping("/get")
	public List<Products> getAll() {
		return product.findAll();
	}
	
	@PutMapping("/update/{id}")
	public Products update(@PathVariable String id, @Validated @RequestBody Products products) {
		return product.save(products);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable String id) {
		product.deleteById(id);
	}
	
	@GetMapping("/order/get/{orderNumber}")
	public List<ProductsOrder> getOrderNumber(@PathVariable String orderNumber) {
		return productsOrder.findByOrderNumber(orderNumber);
	}
	
	@PostMapping("/order/insert")
	public ProductsOrder createProductOrder(@Validated @RequestBody ProductsOrder po) {
		return productsOrder.insert(po);
	}
}
