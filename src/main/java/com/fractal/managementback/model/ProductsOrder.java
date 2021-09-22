package com.fractal.managementback.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "productsOrder")
public class ProductsOrder {
	

	private String orderNumber;
	private String name;
	private int quantity;
	private double unitPrice;
	private double cost;
	
	public ProductsOrder(String orderNumber, String name, int quantity, double unitPrice, double cost) {
		super();
		this.orderNumber = orderNumber;
		this.name = name;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.cost = cost;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
}
