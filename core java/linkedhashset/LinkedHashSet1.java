import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
	LinkedHashSet l1=new LinkedHashSet();
	l1.add(16);
	l1.add("mag");// take  heterogenous values
	l1.add(20);
	l1.add(26);
	l1.add(26);
	l1.add(46);
	l1.add(null);
	Iterator itr=l1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		
	}
	//Generic type
	LinkedHashSet <Integer> l2=new LinkedHashSet<Integer>();
	l2.add(16);
	l2.add(20);
	l2.add(26);
	l2.add(26);
	l2.add(46);
	l2.add(null);
	Iterator <Integer> itr1=l2.iterator();
	while(itr1.hasNext()) {
		System.out.println(itr1.next());
		
	}
	

	}

}
