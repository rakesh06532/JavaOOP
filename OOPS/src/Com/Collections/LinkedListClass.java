package Com.Collections;


import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListClass {
	public void meth()
	{
		LinkedList<Object> ll=new LinkedList<Object>();
		ll.add(10);
		ll.add("java");
		ll.add("Rakesh");
		ll.add(null);
		ll.add(10.5);
		ll.add(95);
		ll.add(10);
		ll.add("java");
		ll.add(true);
		System.out.println(ll);
		System.out.println();
		ListIterator<Object> li= ll.listIterator();
		
		while(li.hasNext())
		{
			System.out.print(li.next()+" ");
		}
		System.out.println("\n");
		
		while(li.hasPrevious())
		{
			System.out.print(li.previous()+" ");
		}
		System.out.println();
		System.out.println("===========================================");
		System.out.println(ll.getFirst());
		System.out.println(ll);
    	System.out.println(ll.getLast());
		System.out.println(ll);
		ll.removeFirst();
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		ll.addFirst(500);
		System.out.println(ll);
		ll.addLast(1000);
		System.out.println(ll);
		ll.add(2, 8000);
		System.out.println(ll);
		ll.add(6,8000);
		System.out.println(ll);
		ll.removeLastOccurrence(8000);
		System.out.println(ll);
		
	}
	public static void main(String[] args) {
		LinkedListClass obj =new LinkedListClass();
		obj.meth();
	}

}
