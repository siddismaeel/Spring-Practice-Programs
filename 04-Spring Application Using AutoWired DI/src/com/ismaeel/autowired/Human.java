package com.ismaeel.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Human {

	public static void main(String ar[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Body body = context.getBean(Body.class, "body");
		body.startHeart();
		
		 ClassPathXmlApplicationContext ctx = (ClassPathXmlApplicationContext) context;
		 ctx.close();
	}
	
}
