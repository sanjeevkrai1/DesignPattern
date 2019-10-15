package com.design.pattern.template;

public class WoodenHouse extends HouseTemplate {

	@Override
	public void buildWalls() {
		System.out.println("Wall is build by Wooden");
	}

	@Override
	public void buildPillars() {
		System.out.println("Pillars are build by Wooden");
	}

	@Override
	public String toString() {
		return "WoodenHouse [toString()=" + super.toString() + "]";
	}
}