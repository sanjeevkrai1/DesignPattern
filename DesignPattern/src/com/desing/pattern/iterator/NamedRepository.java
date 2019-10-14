package com.desing.pattern.iterator;

public class NamedRepository implements Container {

	String[] names = { "Sanjeev", "Abhi", "Suresh" };

	@Override
	public Iterator getIterator() {
		return new NamedIterator();
	}

	private class NamedIterator implements Iterator {
		int index;

		@Override
		public boolean hasNext() {

			if (index < names.length)
				return true;
			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext())
				return names[index++];
			return null;
		}

	}

}
