package com.ismaeel.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.ismaeel.model.Employee;
import com.ismaeel.model.Person;

public class Test {
	
	
	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("bean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Person emp = (Person) factory.getBean("employee");
		
		Person student = factory.getBean("student",com.ismaeel.model.Student.class);
		
		System.out.println(emp);
		
		System.out.println(student);
	}

}
