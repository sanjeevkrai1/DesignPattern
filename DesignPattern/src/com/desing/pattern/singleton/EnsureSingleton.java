package com.desing.pattern.singleton;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class EnsureSingleton implements Cloneable, Serializable {

	private static final long serialVersionUID = -2724043305801033090L;
	private static volatile EnsureSingleton singleton;

	private EnsureSingleton() {

		if (singleton != null) {
			throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
		}
	}

	public EnsureSingleton getInstance() {
		if (singleton == null) {
			synchronized (singleton) {
				if (singleton == null)
					singleton = new EnsureSingleton();
			}
		}

		return singleton;
	}

	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
		ois.defaultReadObject();
		singleton = this;
	}

	public Object readResolver() {
		return singleton;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Clone not supported");
	}
}
