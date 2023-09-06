package Com.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map.Entry;

public class HashMapClass {
	public void meth()
	{
		HashMap<Object,Object> h=new HashMap<Object,Object>();
		System.out.println("======Adding the data==========");
		h.put(101,"Java");
		h.put("java", 1000);
		h.put(null, null);
		h.put(102, "Html");
		h.put(106, "css");
		h.put(109, "Java");
		System.out.println(h);
		System.out.println("---------------------------------------");
		System.out.println("Reteriving the key from hashmap ");
		HashSet<Object> hs1=new HashSet<Object>(h.keySet());
		System.out.println("Key present in map "+hs1);
		System.out.println("=======================================================");
		System.out.println("Reteriving all the key from HashMap");
		Iterator<Object> i=hs1.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		System.out.println();
		System.out.println("Reteriving the key value pairs ");
		HashSet<Object> hs2=new HashSet<Object>(h.entrySet());
		Iterator<Object> i2=hs2.iterator();
		while(i2.hasNext())
		{
			//System.out.print(i2.next()+" ");
			Entry<?,?> e=(Entry<?,?>)i2.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
		System.out.println();
		System.out.println("----------------------------------------------------------------");
		ArrayList<Object> al=new ArrayList<Object>(hs1);
		ListIterator<Object> li=al.listIterator();
		System.out.println("Reteriving the data in forword direction ");
		while(li.hasNext())
		{
			System.out.print(li.next()+" ");
		}
		System.out.println();
		System.out.println( "======================================================================");
		System.out.println("Retering the data in backword direction ");
		while(li.hasPrevious())
		{
			System.out.print(li.previous()+" ");
		}
		System.out.println();
		System.out.println("=================gggg=======================================================");
		ArrayList <Object> al2=new ArrayList<Object>(hs2);
		ListIterator<Object>li2=al2.listIterator();
		while(li2.hasNext())
		{
			Entry<?,?> e2=(Entry<?,?>)li2.next();
			System.out.println(e2.getKey()+" "+e2.getValue());
		}
		System.out.println();
		System.out.println("===================================================================");
		while(li2.hasPrevious())
		{
			Entry<?,?> e3=(Entry<?,?>)li2.previous();
			System.out.println(e3.getKey()+" "+e3.getValue());
			
			
		}
		System.out.println("=========> "+h.get(101));
		System.out.println("=========> "+h.get(1000));
	}
	public static void main(String[] args) {
		HashMapClass obj=new HashMapClass();
		obj.meth();
	}

}
