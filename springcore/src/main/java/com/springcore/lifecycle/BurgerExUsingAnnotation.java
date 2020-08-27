package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BurgerExUsingAnnotation {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BurgerExUsingAnnotation [price=" + price + "]";
	}

	public BurgerExUsingAnnotation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@PostConstruct
	public void init()
	{
		System.out.println("init using annotations");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("destroy using annotations");
	}
	

}
