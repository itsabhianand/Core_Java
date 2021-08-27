package course.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapperExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> names = Arrays.asList("Abhijeet", "Prateek", "Amit", "Gaurav");
		
		System.out.println("Imperative Style : ");
		
		for(String name : names) {
			if(!name.equals("Gaurav")) {
				User user = new User(name);
				System.out.println(user);
			}
		}
		
		System.out.println("Functional Programming Style : ");
		
		names.stream().filter(name -> !name.equals("Gaurav")).map(name -> new User(name)).forEach(System.out::println);
		
		System.out.println("Functional Programming Style using Method Reference : ");
		
		List<User> userList = names.stream().filter(MapperExample::isNotTest).map(User::new).collect(Collectors.toList()); // Collectors is a library in Java which store return type to a Collection Object.
		userList.forEach(System.out::println);
	}
	
	public static boolean isNotTest(String name) {
		return !name.equals("Gaurav");
	}
}


class User{
	String name;
	int age = 30;
	
	User(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
}
