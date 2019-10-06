package com.desing.pattern.abstractfactory;

public class ComputerGeneratorFactory {

	public static Computer generateComputer(ComputerFactory computerFactory) {
		return computerFactory.createComputer();
	}

}
