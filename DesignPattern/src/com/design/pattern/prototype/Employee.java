package com.design.pattern.prototype;

public class Employee implements Prototype<Employee> {

	private String name;
	private String address;
	private String phone;
	private String sex;

	public Employee(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public Employee() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", phone=" + phone + ", sex=" + sex + "]";
	}

	@Override
	public Employee getClone() {
		return new Employee(name, address);
	}

}
