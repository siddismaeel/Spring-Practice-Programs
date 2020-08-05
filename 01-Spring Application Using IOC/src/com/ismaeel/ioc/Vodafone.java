package com.ismaeel.ioc;

public class Vodafone implements Sim {

	@Override
	public void calling() {
		System.out.println("Calling using Vodafone");

	}

	@Override
	public void data() {
		
		System.out.println("Data using Vodafone");
	}

}
