package com.ismaeel.looseCoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	
	

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		System.out.println(context);
		
		
		  Airtel airtel = (Airtel) context.getBean("airtel");
		  
		  airtel.statrtService();
		 
		
		ClassPathXmlApplicationContext ctx = (ClassPathXmlApplicationContext)context;
		ctx.close();
	}

}
