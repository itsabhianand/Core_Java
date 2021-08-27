package com.practice.immutableClasses;

// We can't change state of Object of User class as it doesnot have setter method.
public class ImmutableClasses1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         User user = new User("Abhijeet", "Anand", "Pune");  
         String address = user.getAddress();
         System.out.println(address);
	}

}
