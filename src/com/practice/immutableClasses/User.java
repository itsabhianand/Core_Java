package com.practice.immutableClasses;

public final class User {
    
	private final String firstName;
	private final String lastName;
	private final String address;
	
	public User(String firstName, String lastName, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}
}
