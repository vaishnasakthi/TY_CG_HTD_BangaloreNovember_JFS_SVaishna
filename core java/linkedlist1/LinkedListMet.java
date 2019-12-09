import java.util.LinkedList;

public class LinkedListMet {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		System.out.println("--------------Peek()---------------");
		l1.add(45);
		l1.add(95);
		l1.add(78);
		l1.add(56);
		l1.add(99);
		System.out.println(l1.peek());
		System.out.println(l1);
		System.out.println("--------------PeekFirst()---------------");
		System.out.println(l1.peekFirst());
		System.out.println(l1);
		System.out.println("--------------PeekLast()---------------");
		System.out.println(l1.peekLast());
		System.out.println(l1);
		
		System.out.println("--------------Poll()---------------");
		System.out.println(l1.poll());
		System.out.println(l1);
		System.out.println("--------------PollFirst and PollLast()---------------");
		System.out.println(l1.pollFirst());
		System.out.println(l1);
		System.out.println(l1.pollLast());
		System.out.println(l1);
		System.out.println("--------------offer()---------------");
		l1.offer(16);
		System.out.println(l1);
		System.out.println("--------------offerFirst() and OfferLast()---------------");
		l1.offerFirst(26);
		System.out.println(l1);
		l1.offerLast(46);
		System.out.println(l1);
		
	}

}
