package com.practices.Interviews;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Map<String, String>> outermap = new HashMap<>();
        Map<String, String> innerMap = new HashMap<>();
        final String a1 = "A";
        final String val1 = "1";
        innerMap.put(a1, val1);

				outermap.put("X", innerMap);

        System.out.println("inner map : " + innerMap); // ["A"-"1"]
        System.out.println("outer map : " + outermap); // ["X", ["A"-"1"]]


        final String a2 = "A";
        final String val2 = "2";
        innerMap.put(a2, val2);

				System.out.println("inner map : " + innerMap); // ["A"-"2"]
        System.out.println("outer map : " + outermap); // ["X", ["A"-"2"]]
        
        String a = "Abhijeet";
    	String b = a;
    	a = "Prateek";
    	
    	System.out.println(a);
    	System.out.println(b);
    	
    	String x = new String("Cisco");
    	String m = "Cisco";
    	String n = "Cisco";
    	String y = new String("Cisco");
    	String z = y;
    	//y = "Disco";
    	
    	System.out.println(x.hashCode());
    	System.out.println(y.hashCode());
    	System.out.println(z.hashCode());
    	System.out.println(m.hashCode());
    	System.out.println(x.equals(y));
    	System.out.println(x.equals(z));
    	System.out.println(x == y);
    	System.out.println(y == z);
    	System.out.println(x == m);
    	System.out.println(m == n);
    	System.out.println(n == y);
	}

}
