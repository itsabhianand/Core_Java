package course.java8;

import java.util.Arrays;
import java.util.List;

public class FilterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		List<String> names = Arrays.asList("Abhijeet", "Prateek", "Amit", "Gaurav");
		
		System.out.println("Traditional Style : ");
		
		for(String name : names) {
			if(!name.equals("Gaurav")) {
				System.out.println(name);
			}
		}
		
		
		System.out.println("Functional Programming Style : ");
		
		names.stream().filter(name -> !name.equals("Gaurav")).forEach(name -> System.out.println(name));
		
		System.out.println("Functional Programming using Method Reference : ");
		
		names.stream().filter(FilterExample::isNotTest).forEach(System.out::println);
	}
	
	public static boolean isNotTest(String name) {
		return !name.equals("Gaurav");
	}

}
