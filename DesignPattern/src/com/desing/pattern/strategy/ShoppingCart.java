package com.desing.pattern.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private PaymentStrategy paymentStrategy;
	private List<Item> items = new ArrayList<>();

	public ShoppingCart(PaymentStrategy paymentStrategy, List<Item> items) {
		super();
		this.paymentStrategy = paymentStrategy;
		this.items = items;
	}

	public void bill() {
		double amt = items.stream().mapToDouble(e -> e.getItemPrice()).sum();
		paymentStrategy.pay(amt);
	}

}
