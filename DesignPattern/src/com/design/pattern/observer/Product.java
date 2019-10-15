package com.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {

	List<Observer> listOfProduct = new ArrayList<>();
	private String productName;
	private boolean avialable;

	public boolean isAvialable() {
		return avialable;
	}

	public void setAvialable(boolean avialable) {
		this.avialable = avialable;
		if (avialable)
			notifyObserver();
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public void registerObserver(Observer observer) {
		listOfProduct.add(observer);
	}

	@Override
	public void unRegisterObserver(Observer observer) {
		listOfProduct.remove(observer);
	}

	@Override
	public void notifyObserver() {
		listOfProduct.forEach(e -> {
			e.update(this.productName);
		});
	}

}
