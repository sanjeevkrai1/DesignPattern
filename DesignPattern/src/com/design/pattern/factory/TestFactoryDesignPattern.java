package com.design.pattern.factory;

public class TestFactoryDesignPattern {

	public static void main(String args[]) {

		Computer laptop = ComputerFactory.createComputer("Laptop");
		System.out.println(laptop);

		Computer desktop = ComputerFactory.createComputer("Desktop");
		System.out.println(desktop);

	}

}
