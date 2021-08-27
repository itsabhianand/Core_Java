package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RunnerComparable {
	
	public static void main(String args[]) {
   
	List<Laptop> list = new ArrayList<Laptop>();
	list.add(new Laptop("Dell", 16, 700));
	list.add(new Laptop("HP", 32, 800));
	list.add(new Laptop("Acer", 8, 900));
	
	Collections.sort(list);
	
         for(Laptop l : list) {
        	 System.out.println(l);
         }
	}
}
