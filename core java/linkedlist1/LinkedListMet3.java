import java.util.LinkedList;

public class LinkedListMet3 {

	public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	l1.add(10);
	l1.add(20);
	l1.add(50);
	l1.add(70);
    l1.push(90); //pushing element

    System.out.println(l1);
    System.out.println("--------Pop()----------------");
	l1.pop();
	System.out.println(l1);
	System.out.println("--------element()----------------");
	System.out.println(l1.element());
	System.out.println(l1);
	

	}

}
