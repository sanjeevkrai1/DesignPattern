package com.design.pattern.abstractfactory;

public abstract class Computer {

	public abstract String getHdd();

	public abstract String getRam();

	public abstract String getCpu();

	@Override
	public String toString() {
		return "Computer [getHdd()=" + getHdd() + ", getRam()=" + getRam() + ", getCpu()=" + getCpu() + "]";
	}

}
