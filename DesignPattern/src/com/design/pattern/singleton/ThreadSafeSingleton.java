package com.design.pattern.singleton;

public class ThreadSafeSingleton {
	private static ThreadSafeSingleton threadSafeSingleton = null;

	private ThreadSafeSingleton() {
	}

	public synchronized static ThreadSafeSingleton getInstance() {
		if (threadSafeSingleton == null)
			threadSafeSingleton = new ThreadSafeSingleton();

		return threadSafeSingleton;
	}
}
