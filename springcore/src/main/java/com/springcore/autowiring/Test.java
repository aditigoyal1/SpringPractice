package com.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/autowiring/autowiringconfig.xml");
    
	Employee e1=context.getBean("emp1",Employee.class);
	
	System.out.println(e1);
	
	
//	  Employee e2=context.getBean("emp2",Employee.class);
//	 
//	 System.out.println(e2);
	 
//	 Employee e3=context.getBean("emp3",Employee.class);
//	 
//	 System.out.println(e3);
	 
	
	
	
	}

}
