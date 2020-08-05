package com.ismaeel.autowired;

public class Heart {
	String animalType;
	int noOfHearts;
	public String getAnimalType() {
		return animalType;
	}
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
	public int getNoOfHearts() {
		return noOfHearts;
	}
	public void setNoOfHearts(int noOfHearts) {
		this.noOfHearts = noOfHearts;
	}
	
	public void pump()
	{
		System.out.println("Haert is pumping");
		System.out.println("Animal Type=" +animalType + " Number of hearts= " +noOfHearts);
	}

}
