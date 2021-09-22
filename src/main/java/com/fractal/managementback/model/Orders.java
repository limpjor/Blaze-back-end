package com.fractal.managementback.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orders")
public class Orders {
	
	@Id
	private String orderNumber;
	private String consumer;
	private String status;
	private String date;
	private Double total;
	
	public Orders(String orderNumber, String consumer, String status, String date, Double total) {
		super();
		this.orderNumber = orderNumber;
		this.consumer = consumer;
		this.status = status;
		this.date = date;
		this.total = total;
	}
	
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getConsumer() {
		return consumer;
	}
	public void setConsumer(String consumer) {
		this.consumer = consumer;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
}
