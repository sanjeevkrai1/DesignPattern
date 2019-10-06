package com.design.pattern.factory;

public class ComputerFactory {

	public static Computer createComputer(String computerType) {
		if (computerType == null) {
			return null;
		} else if (computerType.equalsIgnoreCase("Laptop")) {
			return new Laptop("I-7 Core", "1500 GB HDD", "50 BG DDR RAM");
		}else if (computerType.equalsIgnoreCase("Desktop")) {
			return new Desktop("I-7 Core", "1000 GB HDD", "25 BG DDR RAM");
		}
		
		return null;
	}

}
