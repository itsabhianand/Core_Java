package com.practice.immutableClasses;

public class Address implements Cloneable{
   
	String society;
	String city;
	String state;
	
	public Address(String society, String city, String state) {
		this.society = society;
		this.city = city;
		this.state = state;
	}

	public String getSociety() {
		return society;
	}

	public void setSociety(String society) {
		this.society = society;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [society=" + society + ", city=" + city + ", state=" + state + "]";
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
