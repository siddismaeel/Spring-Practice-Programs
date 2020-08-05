package com.ismaeel.noxml;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher{

	@Override
	public void teach() {
		
		System.out.println("Im your math teacher and my name is Ismaeel");
		
	}

	
	
}
