package Com.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.ListIterator;

public class HashsetClass {
	public void meth()
	{
		HashSet<Object> set=new HashSet<Object>();
		set.add(10);
		set.add("Rakesh");
		set.add(10.25);
		set.add(10.20);
		set.add(10);
		set.add(null);
		set.add(true);
		set.add("Rakesh");
		set.add("rakesh");
		set.add("Aryan");
		System.out.println(set);
		System.out.println("Reteriving the data using iterator ");
		Iterator<Object> i1=set.iterator();
		while(i1.hasNext())
		{
			System.out.print(i1.next()+" ");
		}
		System.out.println("\n");
		System.out.println("----------------------------------------------------");
		ArrayList<Object> al=new ArrayList<Object>(set);
		ListIterator<Object> i2=al.listIterator();
		//System.out.println(i2);
		while(i2.hasNext())
		{
			System.out.print(i2.next()+" ");
		}
		System.out.println();
		System.out.println("----------------------------------------------------");
		while(i2.hasPrevious())
		{
			System.out.print(i2.previous()+" ");
		}
		
	}
	public static void main(String[] args) {
		HashsetClass obj=new HashsetClass();
		obj.meth();
		
	}

}
