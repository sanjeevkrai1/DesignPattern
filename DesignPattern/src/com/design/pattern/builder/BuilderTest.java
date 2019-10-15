package com.design.pattern.builder;

import com.design.pattern.builder.Computer.ComputerBuilder;

public class BuilderTest {

	public static void main(String args[]) {
		
		Computer.ComputerBuilder  builder = new ComputerBuilder("10000 GB HDD","12 GB RAM").setBluetoothEnabled(true);
		Computer computer = builder.build();
		
		System.out.println(computer);
	}

}
