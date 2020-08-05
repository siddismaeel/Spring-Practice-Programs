package com.ismaeel.noxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		
		College college = context.getBean(College.class, "college");
		college.info();
		college.teach();
		
		((AnnotationConfigApplicationContext)context).close();
	}

}
