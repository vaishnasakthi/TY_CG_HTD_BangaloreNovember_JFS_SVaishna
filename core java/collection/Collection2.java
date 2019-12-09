import java.util.ArrayList;
import java.util.Collection;

public class Collection2 {

	public static void main(String[] args) {
		Collection c=new ArrayList();
		System.out.println("------addAll()----------");
		c.add(10);
		c.add(20);
		Collection c1=new ArrayList();
		c1.add(30);
		c1.add(40);
        c.addAll(c1);
		System.out.println(c);
		System.out.println("------retainAll()----------");
		Collection c2=new ArrayList();
		c2.add(11);
		c2.add(12);
		c2.add(14);
		Collection c3=new ArrayList();
		c3.add(11);
		c3.add(12);
		c2.add(44);
		
		System.out.println(c2);
		c2.retainAll(c3);
		System.out.println(c2);
		System.out.println("------removeAll()----------");
		c2.removeAll(c3);
		System.out.println(c3);
		System.out.println("------containsAll()----------");
		Collection c4=new ArrayList();
		c4.add(11);
		c4.add(12);
		Collection c5=new ArrayList();
		c5.add(11);
		c5.add(12);
		System.out.println(c4);
		System.out.println(c4.containsAll(c5));
		System.out.println("------clear()----------");
		Collection c6=new ArrayList();
		c6.add(11);
		c6.add(12);
		System.out.println(c6);
		c6.clear();
		System.out.println(c6);
		System.out.println("------toArray()----------");
		Collection c7=new ArrayList();
		c7.add(16);
		c7.add(46);
		System.out.println(c7);

		Object a[]=c7.toArray();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

		
		
		
		

	}

}
