package com.design.pattern.strategy;

import java.util.ArrayList;
import java.util.List;

public class TestStrategyPattern {

	public static void main(String args[]) {

		Item suger = new Item("Suget", "SG001", 43d);
		
		System.out.println(suger);
		Item goodDayBiscuit = new Item("GoodDay Biscuit", "GD001", 30d);

		List<Item> list = new ArrayList<Item>();
		list.add(suger);
		list.add(goodDayBiscuit);

		PaymentStrategy paymentStrategy = new CreditCardPaymentStrategy("123132123123", "04/22", "Sanjeev Kumar Rai");
		ShoppingCart cart = new ShoppingCart(paymentStrategy, list);
		cart.bill();
	}

}
