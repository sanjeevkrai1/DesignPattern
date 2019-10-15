package com.design.pattern.iterator;

public class TestIterator {

	public static void main(String args[]) {
		NamedRepository namedRepository = new NamedRepository();

		Iterator iterator = namedRepository.getIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
