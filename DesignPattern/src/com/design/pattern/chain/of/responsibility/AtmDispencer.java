package com.design.pattern.chain.of.responsibility;

public interface AtmDispencer {
	public void dispence(Currency currency);
	public void nextChain(AtmDispencer atmDispencer);
}
