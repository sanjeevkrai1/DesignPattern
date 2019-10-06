package com.desing.pattern.singleton;

public class EnsureSingleton implements Cloneable {

	private static volatile EnsureSingleton singleton;

	private EnsureSingleton() {

		if (singleton != null) {
			throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
		}
	}

	private synchronized EnsureSingleton getInstance() {
		if (singleton == null)
			singleton = new EnsureSingleton();

		return singleton;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Clone not supported");
	}

}
