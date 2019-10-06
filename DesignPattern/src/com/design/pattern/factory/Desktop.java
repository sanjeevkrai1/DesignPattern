package com.design.pattern.factory;

public class Desktop extends Computer {

	private String cpu;
	private String hdd;
	private String ram;

	public Desktop(String cpu, String hdd, String ram) {
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
		return "Desktop [cpu=" + cpu + ", hdd=" + hdd + ", ram=" + ram + "]";
	}

}
