package com.design.pattern.chain.of.prototype;

public class ProtoTypeTest {

	public static void main(String args[]) {
	
		Employee empPrototype = new Employee();
		empPrototype.setAddress("Gurgram");
		empPrototype.setName("Sanjeev Rai");
		empPrototype.setPhone("9876543210");
		empPrototype.setSex("Male");

		System.out.println("original employee Object : " + empPrototype.toString());
		Employee employeePrototype = empPrototype.getClone();
		System.out.println("prototype employee Object : " + employeePrototype.toString());
	}
}
