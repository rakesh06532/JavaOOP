package Com.Collections;

import java.util.*;


public class ArrayListDemo implements streamDemo {
	public void getResult()
	{
		List<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(15);
		al.add(85);
		al.add(10);
		al.add(52);
		System.out.println(al);
		System.out.println(al.retainAll(al));
		System.out.println(al.size());
		System.out.println("Retriving the date using for loop");
		for(int i=0;i<al.size();i++)
		{
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		System.out.println("Retriving the date using forEach loop");
		for(int x:al)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println(al.isEmpty());
		System.out.println(al.contains(10));
		al.add(al.size(),100);
		System.out.println(al);
	}
	static void getString()
	{
		String s1="Rakesh";
		String s2="Rakesh";
		String s3=new String("Rakesh");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		String s4=new String("Rakesh");
		System.out.println(s3==s4);
		StringBuffer sb1=new StringBuffer("Rakesh");
		StringBuffer sb2=new StringBuffer("Rakesh");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		StringBuilder sb3=new StringBuilder("Rakesh");
		StringBuilder sb4=new StringBuilder("Rakesh");
		System.out.println(sb4==sb3); 
		System.out.println(sb3.equals(sb4));
		System.out.println(s3.equals(s4));
	}
	static void vectorDemo()
	{
		System.out.println("Implementing vector");
		Vector<Object> v=new Vector<Object>();
		v.add(10);
		v.add(20);
		v.add(25);
		v.add(10);
		v.add(null);
		System.out.println(v);
		System.out.println("Retriving the data using Enumeration");
		Enumeration<Object> e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.print(e.nextElement()+" ");
		}
		System.out.println(v.capacity());
		System.out.println(v.size());
		v.add(null);
		System.out.println(v);
	}
	static void LinkedListDemo()
	{
		LinkedList<Object> ll=new LinkedList<Object>();
		ll.add(10);
		ll.add(12);
		ll.add(10);
		ll.add(25);
		ll.add(null);
		ll.add("Rakesh");
		System.out.println(ll);
		ListIterator<Object> li= ll.listIterator();
		System.out.println("Reteriving the data Forward direction ");
		while(li.hasNext())
		{
			System.out.print(li.next()+" ");
		}
		System.out.println();
		while(li.hasPrevious())
		{
			System.out.print(li.previous()+" ");
		}
		System.out.println();
		System.out.println(ll.getLast());
		System.out.println(ll.getFirst());
		System.out.println(ll.removeAll(ll));
		System.out.println(ll);
	}
	public void sortElements()
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(52);
		al.add(25);
		al.add(49);
		System.out.println(al);
	}
	public static void main(String[] args) {
		//ArrayListDemo obj=new ArrayListDemo();
		//new ArrayListDemo().getResult();
		//getString();
		//vectorDemo();
		LinkedListDemo();
		//obj.sortElements();
	}

}
