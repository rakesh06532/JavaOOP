package Com.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraysCollection {
	public void meth()
	{
		System.out.println("Arrays list implementation ");
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		//al.add("Rakesh");
		al.add(null);
		al.add(20);
		al.add(98);
		al.add(10);
		//al.add(true);
		//al.add(10.2);
		al.add(20);
		System.out.println(al.size());
		System.out.println("for loop implementation ");
		for(int i=0;i<al.size();i++)
		{
			System.out.print(al.get(i)+" ");
		}
		System.out.println("\n");
		System.out.println("for each loop implementation ");
		for(Object o:al)
		{
			System.out.print(o+" ");
		}
		System.out.println("\n");
		System.out.println("for loop reverse implementation ");
		for(int i=al.size()-1;i>=0;i--)
		{
			System.out.print(al.get(i)+" ");
		}
		System.out.println("\n");
		System.out.println("Reteriving data using Iterator interface ");
		Iterator<Integer> i=al.iterator();
		{
			while(i.hasNext())
			{
				System.out.print(i.next()+" ");
				
			}
			System.out.println(" \n");
		}
		System.out.println("isEmpty() "+al.isEmpty());
		System.out.println("contains() "+al.contains(98));
		System.out.println("contains() "+al.contains(97));
		//al.clear();
		//System.out.println("isempty() "+al.isEmpty());
		System.out.println("contains() "+al.contains(98));
		System.out.println("contains() "+al.contains((Object)98));
		
	}
	public static void main(String[] args) {
		ArraysCollection obj =new ArraysCollection();
		obj.meth();
		
	}

}
