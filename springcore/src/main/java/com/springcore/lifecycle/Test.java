package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	AbstractApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
    
	Burger b1=(Burger) context.getBean("Burger1");
	
	System.out.println(b1);
//	
//	//to destroy the object we have to initialize the pre-shutdown hook.
//	//which is present in AbstractApplicationContext
//	
   
	
	System.out.println("++++++++");
	
	BurgerExUsingInterfaces b2=(BurgerExUsingInterfaces) context.getBean("Burger2");
	System.out.println(b2);
	
	BurgerExUsingAnnotation b3=(BurgerExUsingAnnotation) context.getBean("Burger3");
	System.out.println(b3);
	
	 context.registerShutdownHook();	
	
	}
	
	

	

}
