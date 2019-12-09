package treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TestSet2 {

	public static void main(String[] args) {
		EmployeeName e1=new EmployeeName();
		EmpAge e2=new EmpAge();
        EmpSal e3=new EmpSal();
		TreeSet<Employee> t1=new TreeSet<Employee>(e3);
		t1.add(new Employee("Jack",24,34000));
		t1.add(new Employee("Samy",22,52000));
		t1.add(new Employee("Jordan",24,30000));
		t1.add(new Employee("Jack",24,34000));
		Iterator<Employee> itr=t1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			
		}
		
	}

}
