package com.ismaeel.model;

public class Address {

	private String country;
	private int zip;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Address [country=" + country + ", zip=" + zip + "]";
	}
	
	
}
