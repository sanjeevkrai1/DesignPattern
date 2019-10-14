package com.desing.pattern.strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {

	private String ccNO;
	private String expriyDate;
	private String nameOnCC;

	public CreditCardPaymentStrategy(String ccNO, String expriyDate, String nameOnCC) {
		super();
		this.ccNO = ccNO;
		this.expriyDate = expriyDate;
		this.nameOnCC = nameOnCC;
	}

	public String getCcNO() {
		return ccNO;
	}

	public String getExpriyDate() {
		return expriyDate;
	}

	public String getNameOnCC() {
		return nameOnCC;
	}

	@Override
	public void pay(Double amount) {
		System.out.println("Shoppong bill need to pay with CC -> " + amount);
	}

}
