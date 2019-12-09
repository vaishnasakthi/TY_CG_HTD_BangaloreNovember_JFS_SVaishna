package treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet <Student> t1=new TreeSet<Student>();
		t1.add(new Student(22,"Jack"));
		t1.add(new Student(26,"Jordan"));
		t1.add(new Student(22,"Jack"));
		Iterator <Student> itr= t1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
