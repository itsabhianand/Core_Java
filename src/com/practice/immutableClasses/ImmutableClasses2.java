package com.practice.immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class ImmutableClasses2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		 List<String> skills = new ArrayList<String>();
		 skills.add("Java");
		 skills.add("Golang");
         User2 u = new User2("Abhijeet", "Anand", new Address("Kunal Aspiree", "Pune", "Maharashtra"), skills);
         
         Address address = u.getAddress();
         //List<String> localSkills = u.getSkills();
         
         // Printing Original Address Object
         System.out.println("Original Address Object is : " + address.toString());
         
         // Printing Original skills List
         //System.out.println(localSkills.toString());
         
         // Creating new Address Object if we implement Cloneable else it will make change in Original Object.
         address.setCity("Bangalore");
         address.setState("Karnataka");
         
         // Modifying ArrayList.
          //localSkills.add("Python");
          //System.out.println(localSkills.toString());
         
         // Printing Modified
         System.out.println("Modified Address Object is : " + address.toString()); 
         System.out.println("Fetching and checking original Object is : " + u.getAddress());
         
         
	}

}
