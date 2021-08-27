package com.practice.immutableClasses;

import java.util.Collections;
import java.util.List;

public final class User2 {
	
	    private final String firstName;
	    private final String lastName;
	    private final Address address;
	    private final List<String> skills;
	     
	    public User2(String firstName, String lastName, Address address, List<String> skills) {
	        super();
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.address = address;
	        this.skills = skills;
	    }
	    public String getFirstName() {
	        return firstName;
	    }
	    public String getLastName() {
	        return lastName;
	    }
	    public Address getAddress() throws CloneNotSupportedException {
	        return (Address) address.clone();
	    }
		public List<String> getSkills() {
			//return skills;
			return (List<String>) Collections.unmodifiableCollection(skills);
		}
	    
	}
