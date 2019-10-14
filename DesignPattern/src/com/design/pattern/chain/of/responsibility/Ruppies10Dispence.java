package com.design.pattern.chain.of.responsibility;

import java.util.function.Predicate;

public class Ruppies10Dispence implements AtmDispencer {

	private AtmDispencer atmDispencer;


	@Override
	public void dispence(Currency currency) {

		Predicate<Currency> predicate10Rs = (curr) -> curr.getAmt() >= 10;
		if (predicate10Rs.test(currency)) {
			int num = currency.getAmt() / 10;
			int remainder = currency.getAmt() % 10;
			System.out.println("Dispensing " + num + " 10rs note");
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