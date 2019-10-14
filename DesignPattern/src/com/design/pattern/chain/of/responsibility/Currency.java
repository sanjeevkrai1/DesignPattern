package com.design.pattern.chain.of.responsibility;

public class Currency {

	private int amt;

	public Currency(int amt) {
		super();
		this.amt = amt;
	}

	public int getAmt() {
		return amt;
	}

	public void setAmt(int amt) {
		this.amt = amt;
	}

	@Override
	public String toString() {
		return "Currency [amt=" + amt + "]";
	}

}
