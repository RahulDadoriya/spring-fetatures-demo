package com.rdodo.springcore.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {

	private int customerId;
	private String name;
	private List<Address> listOfAddress;
	
	public Customer() {
		System.out.println("Customer created");
	}
	
	public Customer(int customerId, String name, List<Address> listOfAddress) {
		this.customerId = customerId;
		this.name = name;
		this.listOfAddress = listOfAddress;
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

	public List<Address> getListOfAddress() {
		return listOfAddress;
	}

	public void setListOfAddress(List<Address> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", listOfAddress=" + listOfAddress + "]";
	}
		
}
