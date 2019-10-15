package com.design.pattern.template;

public class GlassHouse extends HouseTemplate {

	@Override
	public void buildWalls() {
		System.out.println("Wall are build with glass");
	}

	@Override
	public void buildPillars() {
		System.out.println("Pillars are build with glass");
	}

}
