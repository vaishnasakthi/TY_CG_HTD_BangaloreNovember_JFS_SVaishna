import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	l1.add(10);
	l1.add(20);
	l1.add(20);
	l1.add(30);
	l1.add(40);
	ListIterator itr=l1.listIterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		
	}
	  System.out.println(l1);
	  l1.remove(new Integer(20));
	  System.out.println(l1);
	  System.out.println("-----For each loop---------");
	  for(Object o: l1) {
		  System.out.println(o);
		  
	  }
	  System.out.println("-----For loop---------");
	  for(int i=0;i<l1.size();i++) {
		  System.out.println(l1.get(i));
	  }
	
}
}
