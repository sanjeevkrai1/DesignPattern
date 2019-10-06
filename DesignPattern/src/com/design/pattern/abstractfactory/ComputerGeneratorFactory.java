package com.design.pattern.abstractfactory;

public class ComputerGeneratorFactory {

	public static Computer generateComputer(ComputerFactory computerFactory) {
		return computerFactory.createComputer();
	}

}
