package com.design.pattern.singleton;

public class LazyInitializationSingleton {

	private static LazyInitializationSingleton lazyInitializationSingleton = null;

	private LazyInitializationSingleton() {
	}

	public static LazyInitializationSingleton getInstance() {
		if(lazyInitializationSingleton == null)
			lazyInitializationSingleton = new LazyInitializationSingleton();
		
		return lazyInitializationSingleton;
	}
	
}
