package com.design.pattern.abstractfactory;

public class LaptopFactory implements ComputerFactory {

	private String ram;
	private String hdd;
	private String cpu;

	public LaptopFactory(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Computer createComputer() {
		return new Laptop(hdd, ram, cpu);
	}

}
