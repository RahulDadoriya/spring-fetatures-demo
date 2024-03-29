package com.rdodo.springcore.model;

public class Address {

	private String city;

	public Address() {
		System.out.println("Customer address created");
	}

	public Address(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}
	
	
}
