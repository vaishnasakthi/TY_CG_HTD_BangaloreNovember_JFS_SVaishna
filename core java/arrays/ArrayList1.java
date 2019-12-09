package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer> ();
		System.out.println("-------add()-------------");
		a1.add(11);
		a1.add(22);
		a1.add(33);
		a1.add(44);
		System.out.println(a1);
		System.out.println("-------remove()-------------");
		a1.remove(3);
		System.out.println(a1);
		System.out.println("-------iterating using get()-------------");
	     for(int i=0;i<a1.size();i++) {
	    	 System.out.println(a1.get(i));
	     }
	     System.out.println("-------iterating using foreach loop-------------");
	     for(Integer i1:a1){
	    	 System.out.println(i1);
	    	 
	     }
	     System.out.println("-------iterating using Iterator-------------");
	  Iterator <Integer> itr1=a1.iterator();
	  while(itr1.hasNext()) {
		  System.out.println(itr1.next());
	  }
	  System.out.println("-------iterating using ListIterator from last to first-------------");
	  ListIterator <Integer> itr2=a1.listIterator(a1.size());
	  while(itr2.hasPrevious()) {
		  System.out.println(itr2.previous());
	  }
	  System.out.println("-------iterating using ListIterator from  first to last -------------");
	  ListIterator <Integer> itr3=a1.listIterator();
	  while(itr3.hasNext()) {
		  System.out.println(itr3.next());
	  }
	}

}
