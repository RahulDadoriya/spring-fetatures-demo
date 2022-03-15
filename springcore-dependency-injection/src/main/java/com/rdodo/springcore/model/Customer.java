package com.rdodo.springcore.model;

public class Customer {

	private int customerId;
	private String name;
	private Address address;
	private CheckIns checkIns;
	
	
	public Customer() {
		System.out.println("Customer created");
	}
	public Customer(int customerId, String name, Address address) {
		this.customerId = customerId;
		this.name = name;
		this.address = address;
	}
	
	public Customer(int customerId, String name, Address address, CheckIns checkIns) {
		this.customerId = customerId;
		this.name = name;
		this.address = address;
		this.checkIns = checkIns;
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
		return "Customer [customerId=" + customerId + ", name=" + name + ", address=" + address + ", checkIns="
				+ checkIns + "]";
	}
	
	
	
}
