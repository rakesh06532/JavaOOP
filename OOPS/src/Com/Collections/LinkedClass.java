package Com.Collections;

import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedClass {
	public void meth1()
	{
		System.out.println("Implementing LinkedList ");
		LinkedList<Object> ll=new LinkedList<Object>();
		ll.add(10);
		ll.add(null);
		ll.add("Rakrsh");
		ll.add(1);
		ll.add(45);
		ll.add(25);
		ll.add(10);
		ll.add("Aryan");
		ll.add(10.2);
		System.out.println(ll);
		System.out.println();
		ListIterator<Object> li=ll.listIterator();
		System.out.println("Reteriving data forward direction ");
		while(li.hasNext())
		{
			System.out.print(li.next()+" ");
		}
		System.out.println("\n");
		System.out.println("Retering data reverse direction ");
		while(li.hasPrevious())
		{
			System.out.print(li.previous()+" ");
		}
		System.out.println("\n");
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.removeFirst());
		System.out.println(ll);
		System.out.println(ll.removeLast());
		System.out.println(ll);
		ll.addFirst(500);
		ll.addLast(1000);
		ll.add(1000);
		ll.add(1000);
		System.out.println(ll);
		ll.add(5,10000);
		System.out.println(ll);
		ll.removeFirstOccurrence(1000);
		System.out.println(ll);
		
	}
	public static void main(String[] args) {
		LinkedClass obj=new LinkedClass();
		obj.meth1();
	}

}
