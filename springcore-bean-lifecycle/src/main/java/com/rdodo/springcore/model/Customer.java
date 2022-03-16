package com.rdodo.springcore.model;

public class Customer {

	private int customerId;
	private String name;
	private Address address;
	
	
	public Customer() {
		System.out.println("Customer created");
	}
	public Customer(int customerId, String name, Address address) {
		this.customerId = customerId;
		this.name = name;
		this.address = address;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", address=" + address + "]";
	}
	
	
	public void myInitMethod() {
		System.out.println("Calling init method and changing the customer Id : " + this.customerId);
		this.customerId = customerId * 2;		
	}
	
	public void myDestroyMethod() {
		System.out.println("Calling destroy method");
	}
	
	
}
