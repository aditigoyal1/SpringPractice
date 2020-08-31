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
		
		Student student1=context.getBean("Ob1",Student.class);
		
		System.out.println(student);
		System.out.println(student1);
		
		System.out.println(student.hashCode());
		
		System.out.println(student1.hashCode());
		
		
		Employee e1=context.getBean("e1",Employee.class);
		Employee e2=context.getBean("e1",Employee.class);
        System.out.println(e1.hashCode());
		
		System.out.println(e2.hashCode());
		
		
		

	}

}
