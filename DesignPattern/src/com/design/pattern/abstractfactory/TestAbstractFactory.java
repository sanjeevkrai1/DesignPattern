package com.design.pattern.abstractfactory;

public class TestAbstractFactory {

	public static void main(String args[]) {
		LaptopFactory laptopFactory = new LaptopFactory("16 GB-DDR", "1000 GB SATA", "I-7 Core");
		Computer laptop = laptopFactory.createComputer();
		System.out.println(laptop);

		DesktopFactory desktopFactory = new DesktopFactory("10 GB-DDR", "2000 GB SATA", "I-7 Core");
		Computer desktop = desktopFactory.createComputer();
		
		System.out.println(desktop);
	}

}
