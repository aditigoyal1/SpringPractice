package com.springcore.autowiring;

public class Employee {

	
	private Address address;

	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Using constructor");
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Using setter");
	}

}
