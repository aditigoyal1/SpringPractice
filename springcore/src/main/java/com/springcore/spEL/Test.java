package com.springcore.spEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/spEL/config.xml");
		Demo d1=context.getBean("demo",Demo.class);
		
		System.out.println(d1);
		
		//Using parser
		SpelExpressionParser temp=new SpelExpressionParser();
		//direct expression should be passed
		Expression expression=temp.parseExpression("67+89");
		
		System.out.println(expression.getValue());
		
		

	}

}
