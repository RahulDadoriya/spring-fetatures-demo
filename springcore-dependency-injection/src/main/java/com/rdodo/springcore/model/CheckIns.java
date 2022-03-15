package com.rdodo.springcore.model;

import java.util.List;

public class CheckIns {
	private List<Address> listOfAddress;

	public CheckIns(List<Address> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}

	public CheckIns() {
	}

	public List<Address> getListOfAddress() {
		return listOfAddress;
	}

	public void setListOfAddress(List<Address> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}

	@Override
	public String toString() {
		return "CheckIns [listOfAddress=" + listOfAddress + "]";
	}


}
