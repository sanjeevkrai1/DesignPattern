package com.desing.pattern.singleton;

public class EgerSingleton {

	private static EgerSingleton egerSingleton = new EgerSingleton();
	
	private EgerSingleton() {
		
	}

	public static EgerSingleton getInstrance() {
		return egerSingleton;
	}

	@Override
	public String toString() {
		return "EgerSingleton [toString()=" + super.toString() + "]";
	}

}
