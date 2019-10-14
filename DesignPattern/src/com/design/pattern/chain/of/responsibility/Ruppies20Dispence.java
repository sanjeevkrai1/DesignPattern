package com.design.pattern.chain.of.responsibility;

import java.util.function.Predicate;

public class Ruppies20Dispence implements AtmDispencer {

	private AtmDispencer atmDispencer;

	@Override
	public void dispence(Currency currency) {

		Predicate<Currency> predicate20Rs = (curr) -> curr.getAmt() >= 20;
		if (predicate20Rs.test(currency)) {
			int num = currency.getAmt() / 20;
			int remainder = currency.getAmt() % 20;
			System.out.println("Dispensing " + num + " 20rs note");
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