package com.ismaeel.looseCoupling;

public class Airtel {

	private Service service;

	public void statrtService()
	{
		service.activeService();
	}
	
	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}
	
	
	
}
