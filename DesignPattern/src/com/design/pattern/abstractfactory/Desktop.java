package com.design.pattern.abstractfactory;

public class Desktop extends Computer {

	private String hdd;
	private String ram;
	private String cpu;

	public Desktop(String hdd, String ram, String cpu) {
		super();
		this.hdd = hdd;
		this.ram = ram;
		this.cpu = cpu;
	}

	@Override
	public String getHdd() {
		return hdd;
	}

	@Override
	public String getRam() {
		return ram;
	};

	@Override
	public String getCpu() {
		return cpu;
	}

	@Override
	public String toString() {
		return "Desktop [hdd=" + hdd + ", ram=" + ram + ", cpu=" + cpu + "]";
	}

}
