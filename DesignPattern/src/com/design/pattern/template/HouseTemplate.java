package com.design.pattern.template;

public abstract class HouseTemplate {

	public final void buidHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindow();

		System.out.println("House is builded...");

	}

	private void buildWindow() {
		System.out.println("Window is builded...");
	}

	private void buildFoundation() {
		System.out.println("Building foundation is builded...");
	}

	// methods to be implemented by subclasses
	public abstract void buildWalls();
	public abstract void buildPillars();

}
