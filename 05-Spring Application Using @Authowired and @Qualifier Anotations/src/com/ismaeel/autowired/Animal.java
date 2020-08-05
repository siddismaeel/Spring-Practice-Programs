package com.ismaeel.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Animal {

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		Body body = context.getBean(Body.class, "body");
		
		System.out.println(body);
		
		body.start();
	}
	
}
