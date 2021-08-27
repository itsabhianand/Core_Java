package course.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FlatMapOptionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<User3> users = Arrays.asList(
				 new User3("Abhijeet" , 27, Arrays.asList("1", "2", "3")),
				 new User3("Prateek" , 27, Arrays.asList("4", "5", "6")),
				 new User3("Amit" , 27, Arrays.asList("7", "8", "9")),
				 new User3("Gaurav" , 27, Arrays.asList("10", "11", "12"))
				 );
		 
		 System.out.println("Functional Programming : ");
		 
         Optional<String> optional = users.stream().map(user -> user.getPhoneNumbers().stream()).flatMap(stringStream -> stringStream.filter(phoneNo -> phoneNo.equals("18"))).findAny();		 
		 
         optional.ifPresent(System.out::println);
	}
	
	public static boolean isNotTest(String name) {
		return !name.equals("Gaurav");
	}

}

class User3{
	String name;
	int age;
	List<String> phoneNumbers;
	
	public User3(String name, int age, List<String> phoneNumbers) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNumbers = phoneNumbers;
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

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
}
