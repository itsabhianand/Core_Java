package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RunnerComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Laptop> list = new ArrayList<Laptop>();
		list.add(new Laptop("Dell", 16, 700));
		list.add(new Laptop("HP", 32, 800));
		list.add(new Laptop("Acer", 8, 900));
		
		Comparator<Laptop> comp = new Comparator<Laptop>() {

			@Override
			public int compare(Laptop lap1, Laptop lap2) {
				// TODO Auto-generated method stub
				if(lap1.getPrice() > lap2.getPrice()) {
					return 1;
				}
				else {
					return -1;
				}
			}
			
		};
		
		Collections.sort(list, comp);
		
		for(Laptop l : list) {
			System.out.println(l);
		}
	}

}
