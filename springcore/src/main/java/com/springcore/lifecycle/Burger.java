package com.springcore.lifecycle;

public class Burger {
	private double price;
	
	@Override
	public String toString() {
		return "Burger [price=" + price + "]";
	}
	
	public Burger() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		System.out.println("Setting the price");
		this.price = price;
	}
	
	
	public void init1()
	{
		System.out.println("Inside init method");
	}
	
	public void destroy1()
	{
		System.out.println("Inside Destroy method");
	}
}
