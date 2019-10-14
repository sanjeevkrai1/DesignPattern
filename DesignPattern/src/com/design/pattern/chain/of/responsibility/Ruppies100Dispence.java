package com.design.pattern.chain.of.responsibility;

import java.util.function.Predicate;

public class Ruppies100Dispence implements AtmDispencer {

	private AtmDispencer atmDispencer;

	@Override
	public void dispence(Currency currency) {
		
		Predicate<Currency> predicate100Rs = (curr) -> curr.getAmt() >= 100;
		if(predicate100Rs.test(currency)) {
			int num = currency.getAmt()/100;
			int remainder = currency.getAmt() % 100;
			System.out.println("Dispensing "+num+" 100rs note");
			if(remainder !=0) this.atmDispencer.dispence(new Currency(remainder));

		}else {
			this.atmDispencer.dispence(currency);
		}
	
	}

	@Override
	public void nextChain(AtmDispencer atmDispencer) {
		this.atmDispencer = atmDispencer;
	}

}