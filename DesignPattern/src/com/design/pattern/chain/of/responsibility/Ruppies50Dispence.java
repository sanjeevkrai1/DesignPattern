package com.design.pattern.chain.of.responsibility;

import java.util.function.Predicate;

public class Ruppies50Dispence implements AtmDispencer {

	private AtmDispencer atmDispencer;

	@Override
	public void dispence(Currency currency) {

		Predicate<Currency> predicate50Rs = (curr) -> curr.getAmt() >= 50;
		if (predicate50Rs.test(currency)) {
			int num = currency.getAmt() / 50;
			int remainder = currency.getAmt() % 50;
			System.out.println("Dispensing " + num + " 50rs note");
			if (remainder != 0)
				this.atmDispencer.dispence(new Currency(remainder));

		} else {
			this.atmDispencer.dispence(currency);
		}

	}

	@Override
	public void nextChain(AtmDispencer atmDispencer) {
		this.atmDispencer = atmDispencer;
	}

}