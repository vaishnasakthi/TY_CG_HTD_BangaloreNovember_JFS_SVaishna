import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		
	List l1=new ArrayList();
	System.out.println("-------Add(index,element)----------");
	l1.add(0,10);
	l1.add(1,20);
	l1.add(2,30);
	l1.add(3,40);
	System.out.println(l1);
	System.out.println("------------remove(index)-------------");
	List l2=new ArrayList();
	l2.add(0,11);
	l2.add(1,22);
	l2.add(2,33);
	l2.add(3,44);
	System.out.println(l2);
    l2.remove(2);
    System.out.println(l2);
	System.out.println("------------indexof(object o)-------------");
	List l3=new ArrayList();
	l3.add(0,13);
	l3.add(1,23);
	l3.add(2,33);
	l3.add(3,43);
	System.out.println(l3.indexOf(33));
	
	System.out.println("------------LastIndexOf(object o)-------------");
	List l4=new ArrayList();
	l4.add(0,13);
	l4.add(1,23);
	l4.add(2,33);
	l4.add(3,43);
	l4.add(4,23);
	System.out.println(l4.lastIndexOf(23));
	System.out.println("------------get(index)-------------");
	List l5=new ArrayList();
	l5.add(0,13);
	l5.add(1,23);
	l5.add(2,33);
	l5.add(3,43);
	l5.add(4,23);
	System.out.println(l5.get(4));
	System.out.println("------------addAll(index,collection)-------------");
	l4.addAll(1,l5);
	System.out.println(l4);
	System.out.println("------------set(index,collection)-------------");
	List l6=new ArrayList();
	l6.add(0,13);
	l6.add(1,23);
	l6.add(2,33);
	l6.add(3,43);
	l6.add(4,23);
	System.out.println(l6);
	l6.set(2, 16);
	System.out.println(l6);
	System.out.println("------------sublist(start)-------------");
	System.out.println(l6);
	System.out.println(l6.subList(1, 4));
	}
	
	
}
