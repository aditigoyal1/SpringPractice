package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BurgerExUsingInterfaces implements InitializingBean,DisposableBean{

	private double price;

	@Override
	public String toString() {
		return "BurgerExUsingInterfaces [price=" + price + "]";
	}

	public BurgerExUsingInterfaces() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		System.out.println("set the price:inside interfaces");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("inside interface destroy method");
		
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside interface init method");

	}

	
}
