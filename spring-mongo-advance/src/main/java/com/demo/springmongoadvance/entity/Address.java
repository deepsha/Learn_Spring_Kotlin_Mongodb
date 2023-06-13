package com.demo.springmongoadvance.entity;

public class Address {
	
	private String addressLine;
	private String city;
	private Integer postalcode;
	public Address() {}
	
	public Address(String addressLine, String city, Integer postalcode) {
		super();
		this.addressLine = addressLine;
		this.city = city;
		this.postalcode = postalcode;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(Integer postalcode) {
		this.postalcode = postalcode;
	}

}
