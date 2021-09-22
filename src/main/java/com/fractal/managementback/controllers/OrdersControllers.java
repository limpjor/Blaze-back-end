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

import com.fractal.managementback.model.Orders;
import com.fractal.managementback.repository.OrdersRepository;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,RequestMethod.DELETE })
@RequestMapping("/api/orders")
public class OrdersControllers {
	
	@Autowired
	private OrdersRepository repo;
	
	@PostMapping("/insert")
	public Orders create(@Validated @RequestBody Orders orders) {
		return repo.insert(orders);
	}
	
	@GetMapping("/get")
	public List<Orders> getAll() {
		return repo.findAll();
	}
	
	@PutMapping("/update/{id}")
	public Orders update(@PathVariable String orderNumber, @Validated @RequestBody Orders orders) {
		return repo.save(orders);
	}
	
	@DeleteMapping("/delete/{orderNumber}")
	public void delete(@PathVariable String orderNumber) {
		repo.deleteById(orderNumber);
	}
}
