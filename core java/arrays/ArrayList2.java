package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList2 {

	public static void main(String[] args) {
	ArrayList<String> a1=new ArrayList<String>();
	a1.add("H");
	a1.add("E");
	a1.add("L");
	a1.add("L");
	a1.add("O");
	ArrayList<String> a2=new ArrayList<String>();
	a2.add(" ");
	a2.add("W");
	a2.add("O");
	a2.add("R");
	a2.add("L");
	a2.add("D");
	
	System.out.println("---------add()-------------");
	System.out.println(a1);
	System.out.println("---------addAll()-------------");
	a1.addAll(a2);
	System.out.println(a1);
	System.out.println("--------remove()----------");
	a1.remove("L");
	
	System.out.println(a1);
	a1.add(2,"L");
	
	System.out.println("-------iterating using get()-------------");
    for(int i=0;i<a1.size();i++) {
   	 System.out.println(a1.get(i));
    }
    System.out.println("-------iterating using foreach loop-------------");
    for(String s1:a1) {
    	System.out.println(s1);
    	
    }
    System.out.println("-------iterating using Iterator-------------");
	  Iterator <String> itr1=a1.iterator();
	  while(itr1.hasNext()) {
		  System.out.println(itr1.next());
	  }
	  System.out.println("-------iterating using ListIterator from last to first-------------");
	  ListIterator <String> itr2=a1.listIterator(a1.size());
	  while(itr2.hasPrevious()) {
		  System.out.println(itr2.previous());
	  }
	  System.out.println("-------iterating using ListIterator from first to last-------------");
	  ListIterator <String> itr3=a1.listIterator();
	  while(itr3.hasNext()) {
		  System.out.println(itr3.next());
		  
	  }
	  System.out.println("-------lastindexof()-------------");
	  System.out.println(a1.lastIndexOf("L"));
	  System.out.println("-------indexof()-------------");
	  System.out.println(a1.indexOf("L"));
	  System.out.println("-------get()-------------");
	  System.out.println(a1.get(3));
	  
	}

}
