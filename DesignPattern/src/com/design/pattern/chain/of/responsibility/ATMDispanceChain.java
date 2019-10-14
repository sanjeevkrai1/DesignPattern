package com.design.pattern.chain.of.responsibility;

import java.util.Scanner;

public class ATMDispanceChain {
	public ATMDispanceChain() {
	}

	public static void main(String args[]) {

		AtmDispencer ruppies500Dispence = new Ruppies500Dispence();
		AtmDispencer ruppies100Dispence = new Ruppies100Dispence();
		AtmDispencer ruppies50Dispence = new Ruppies50Dispence();
		AtmDispencer ruppies20Dispence = new Ruppies20Dispence();
		AtmDispencer ruppies10Dispence = new Ruppies10Dispence();

		ruppies500Dispence.nextChain(ruppies100Dispence);
		ruppies100Dispence.nextChain(ruppies50Dispence);
		ruppies50Dispence.nextChain(ruppies20Dispence);
		ruppies20Dispence.nextChain(ruppies10Dispence);

		while (true) {
			int amount = 0;
			System.out.println("Enter amount to dispense");

			try (Scanner input = new Scanner(System.in)) {
				amount = input.nextInt();
				if (amount % 10 != 0) {
					System.out.println("Amount should be in multiple of 10s.");
					return;
				}
				// process the request
				ruppies500Dispence.dispence(new Currency(amount));
			}
		}

	}

}
