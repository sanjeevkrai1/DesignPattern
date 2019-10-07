package com.desing.pattern.template;

public class TestTemplateDesignPattern {

	public static void main(String args[]) {
		HouseTemplate template = new GlassHouse();
		
		template.buidHouse();
		
		
		System.out.println("============================\n");
		template = new WoodenHouse();
		
		template.buidHouse();
		
	}

}
