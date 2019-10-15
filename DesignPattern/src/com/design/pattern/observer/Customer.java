package com.design.pattern.observer;

public class Customer implements Observer {

	private String customerName;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public void update(String productName) {
		System.out.println("Hello  " + customerName + " " + productName + " is avialable for shopping");
	}

}
