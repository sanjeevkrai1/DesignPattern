package com.design.pattern.singleton;

public class StaticBlockSingleton {
	
	private StaticBlockSingleton() {
		
	}

	private static StaticBlockSingleton staticBlockSingleton = null;

	static {
		try {
			staticBlockSingleton = new StaticBlockSingleton();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static StaticBlockSingleton getSingleton() {
		return staticBlockSingleton;
	}

}
