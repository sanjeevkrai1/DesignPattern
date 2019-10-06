package com.desing.pattern.abstractfactory;

public class DesktopFactory implements ComputerFactory {

	private String ram;
	private String hdd;
	private String cpu;

	public DesktopFactory(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Computer createComputer() {
		return new Desktop(hdd, ram, cpu);
	}

}
