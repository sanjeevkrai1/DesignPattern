package com.desing.pattern.observer;

public class TestObserver {
	public static void main(String args[]) {
		Customer c1 = new Customer();
		Customer c2 = new Customer();

		c1.setCustomerName("Vikas");
		c2.setCustomerName("Vimlesh");

		Product iphone6 = new Product();
		iphone6.setProductName("Iphone 6");

		iphone6.registerObserver(c1);
		iphone6.registerObserver(c2);

		iphone6.setAvialable(true);

		iphone6.unRegisterObserver(c2);

		System.out.println("**************************");
		iphone6.setAvialable(true);

	}
}
