package hashCode_Equals;

import java.util.HashMap;
import java.util.Map;

public class DemoHashCodeEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Employee emp1 = new Employee(1);
         Employee emp2 = new Employee(1);
         
         Map<Employee, String> map = new HashMap<Employee, String>();
         
         map.put(emp1, "jack");
         map.put(emp2, "jack");
         
         System.out.println(map.size());
         
         
         Map<Integer, String> map2 = new HashMap<Integer, String>();
         Integer i1 = new Integer(1);
         Integer i2 = new Integer(1);
         
         map2.put(i1, "Jack");
         map2.put(i2, "Jack");
         
         System.out.println(map2.size());
	}

}


class Employee {
	
	int id;
	
	Employee(int id){
		this.id = id;
	}
	
	// Overidding equals and hashCode in Employee class.
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = result * prime + id;
		return result;
	}
	
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		
		if(this.getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if(this.id != other.id)
			return false;
			
		return true;
	}
}
