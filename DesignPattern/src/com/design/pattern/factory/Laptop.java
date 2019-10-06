package com.design.pattern.factory;

public class Laptop extends Computer {

	private String cpu;
	private String hdd;
	private String ram;

	public Laptop(String cpu, String hdd, String ram) {
		super();
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
	}

	@Override
	public String getRam() {
		return ram;
	}

	@Override
	public String getCpu() {
		return cpu;
	}

	@Override
	public String getHdd() {
		return hdd;
	}

	@Override
	public String toString() {
		return "Laptop [cpu=" + cpu + ", hdd=" + hdd + ", ram=" + ram + "]";
	}

}
