package com.desing.pattern.observer;

public interface Subject {
	public void registerObserver(Observer observer);

	public void unRegisterObserver(Observer observer);

	public void notifyObserver();

}
