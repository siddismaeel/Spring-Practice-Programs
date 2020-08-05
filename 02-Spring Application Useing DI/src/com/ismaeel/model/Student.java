package com.ismaeel.model;

public class Student implements Person {

	private int sId;
	private String sName;
	private Address address;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", address=" + address + "]";
	}
	
	
	
}
