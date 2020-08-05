package com.ismaeel.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Sim airtel = (Sim) context.getBean("airtel");
		
		airtel.calling();
		airtel.data();
		
		Sim voda = (Sim) context.getBean("vodafone");
		
		voda.calling();
		voda.data();
		
		ClassPathXmlApplicationContext ctx = (ClassPathXmlApplicationContext)context;
		
		ctx.close();
		
	}

}
