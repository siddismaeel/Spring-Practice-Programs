package com.ismaeel.noxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class College {
	
	@Autowired
	private Principal principal;
	
	@Autowired
	@Qualifier("mathTeacher")
	private Teacher teacher;
	
	public void info()
	{
		principal.principalInfo();
	}
	

	public void teach()
	{
		teacher.teach();
	}
	
}
