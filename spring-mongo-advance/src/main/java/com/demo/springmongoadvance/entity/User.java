package com.demo.springmongoadvance.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="order_db")
public class User {
	@Id
	private Integer id;
	private String name;
	private String gender;
	private List<Product> products;
	private Address address;
	public User() {}
	
	
	public User(Integer id, String name, String gender, List<Product> products, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.products = products;
		this.address = address;
	}

	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public List<Product> getProducts() {
		return products;
	}


	public void setProducts(List<Product> products) {
		this.products = products;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
