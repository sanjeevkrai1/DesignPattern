package com.desing.pattern.strategy;

public class PaypallPaymentStrategy implements PaymentStrategy {

	private String email;
	private String password;
	private Double walletAmt;

	public PaypallPaymentStrategy(String email, String password, Double walletAmt) {
		super();
		this.email = email;
		this.password = password;
		this.walletAmt = walletAmt;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public Double getWalletAmt() {
		return walletAmt;
	}

	@Override
	public void pay(Double amount) {

	}

}
