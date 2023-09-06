package Com.Collections;

import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;

public class VectorClass {
	void meth1()
	{
		System.out.println("Implementing vector ");
		Vector<Object> v=new Vector<Object>();
		v.add(10);
		v.add(null);
		v.add("Rakesh");
		v.add(1);
		v.add(45);
		v.add(25);
		v.add(10);
		System.out.println("Reteriving the data using for loop ");
		for(int i=0;i<v.size();i++)
		{
			System.out.print(v.get(i)+" ");
		}
		System.out.println("\n");
		System.out.println("Reteriving the data using each loop ");
		for(Object o:v)
		{
			System.out.print(o+" ");
			
		}
		System.out.println("\n");
		System.out.println("Reteriving the data using enumarator ");
		Enumeration<Object> e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.print(e.nextElement()+" ");
		}
		System.out.println("\n");
		System.out.println("Reteriving the data using Iterator ");
		Iterator<Object> i=v.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		System.out.println("\n");
		v.add(v.size()-1,500);
		System.out.println(v);
		System.out.println(v.capacity());
		v.add(600);
		v.add("HTML");
		System.out.println(v.capacity());
		v.add(null);
		System.out.println(v.capacity());
		System.out.println(v.size());
		
	}
	public static void main(String[] args) {
		VectorClass obj=new VectorClass();
		obj.meth1();
	}

}
