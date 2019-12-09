package linkedHashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHSCustom {

	public static void main(String[] args) {
		LinkedHashSet <Employee> l1=new LinkedHashSet<Employee>();
		l1.add(new Employee("George",22));
		l1.add(new Employee("Kenny",26));
		l1.add(new Employee("George",22));
		Iterator <Employee> itr=l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		

	}

}
