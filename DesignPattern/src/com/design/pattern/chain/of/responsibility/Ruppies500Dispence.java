package com.design.pattern.chain.of.responsibility;

import java.util.function.Predicate;

public class Ruppies500Dispence implements AtmDispencer {

	private AtmDispencer atmDispencer;

	@Override
	public void dispence(Currency currency) {
		
		Predicate<Currency> predicate500Rs = (curr) -> curr.getAmt() >= 500;
		if(predicate500Rs.test(currency)) {
			int num = currency.getAmt()/500;
			int remainder = currency.getAmt() % 500;
			System.out.println("Dispensing "+num+" 500rs note");
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