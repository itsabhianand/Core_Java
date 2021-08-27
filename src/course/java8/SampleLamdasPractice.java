package course.java8;

import java.util.Arrays;
import java.util.List;

public class SampleLamdasPractice {

	public static void main(String[] args) {
		
		List<Student> students = Arrays.asList(
				new Student("Saurabh", "Pune", 26),
				new Student("Robert", "Pune", 25),
				new Student("John", "Mumbai", 21),
				new Student("Roman", "Pune", 18),
				new Student("Randy", "Mumbai", 17)
				);
				
				
		// TODO Auto-generated method stub
	   System.out.println("Print all students who lives in Pune : ");
	   students.stream().filter(student -> student.getCity().equals("Pune")).forEach(System.out::println);
	   System.out.println("Find student with name Saurabh else return null.");
	   students.stream().filter(student -> student.getName().equals("Saurabh")).findAny().orElse(null);
	}

}

class Student {
	
	String name;
	String city;
	int age;
	
	public Student(String name, String city, int age) {
		this.name = name;
		this.city = city;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", age=" + age + "]";
	}
}
