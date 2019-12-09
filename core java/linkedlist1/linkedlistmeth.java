import java.util.LinkedList;

public class linkedlistmeth {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		  System.out.println("-----adding---------");
		  l1.add(10);
		  l1.add(15);
		  l1.add(30);
		  l1.add(46);
		  l1.add(89);
		  l1.add(10);
		  
		  System.out.println(l1);
		  System.out.println("-----addFirst()---------");
		  l1.addFirst(16);
		  System.out.println(l1);
		  System.out.println("-----addLast()---------");
		  l1.addLast(46);
		  System.out.println(l1);
		  System.out.println("-----remove()---------");
		  l1.remove();
		  System.out.println(l1);
		  System.out.println("-----removeFirst() and removeLast()---------");
		  l1.removeFirst();
		  System.out.println(l1);
		  
		  l1.removeLast();
		  System.out.println(l1);
		  System.out.println("-----removeFirstOccurance() and removeLastOccuarance()---------");
		  l1.removeFirstOccurrence(10);
		  System.out.println(l1);
		  l1.removeLastOccurrence(10);
		  System.out.println(l1);
		  System.out.println("-----getFirst() and getLast()---------");
		  System.out.println(l1.getFirst());
		  System.out.println(l1.getLast());
		  
		  
	}

}
