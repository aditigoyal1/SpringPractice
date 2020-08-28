package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/stereotype/Stereoconfig.xml");
		
		
		// Student student=new Student();		
		//Student student=context.getBean("student",Student.class);
		
		//if we want to change the default name of the object---pass it on @Component("newName")
		Student student=context.getBean("Ob1",Student.class);
		
		System.out.println(student);
		

	}

}
