package com.ismaeel.noxml;

import org.springframework.stereotype.Component;

@Component
public class JavaTeacher implements Teacher {

	@Override
	public void teach() {
		
		System.out.println("I am your java Teacher and my name is Ismaeel");

	}

}
