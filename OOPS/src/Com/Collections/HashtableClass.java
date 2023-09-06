package Com.Collections;

import java.util.Hashtable;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Map.Entry;


public class HashtableClass {
	void meth()
	{
		Hashtable<Object,Object> ht=new Hashtable<Object,Object>();
		ht.put(101,"Java");// Insertion Order is not maintained
        ht.put("Java",1000);// Heterogeneous Keys & Heterogeneous values are allowed
        ht.put(103,"Pyython"); // null keys & null values are not allowed
        ht.put(102,"Html");// Duplicate values are allowed
        ht.put(106,"CSS");// It is available from Java 1.0v
        ht.put(108,"Java");// Default capacity is 16 [Load Factor : 0.75]
        ht.put(105,"Oracle");// Its size increases by double
        System.out.println(ht); // It is synchronized
        
        ArrayList<Object> al=new ArrayList<Object>(ht.entrySet());
        ListIterator<Object> i=al.listIterator();
        while(i.hasNext())
        {
        	//System.out.println(i.next());
        	Entry<?,?> e=(Entry<?,?>)i.next();
        	System.out.println(e.getKey()+" "+e.getValue());
        }
        while(i.hasPrevious())
        {
        	//System.out.println(i.previous());
        	Entry<?,?> e=(Entry<?,?>)i.previous();
        	System.out.println(e.getKey()+" "+e.getValue());
        }
		
	}
	public static void main(String[] args) {
		HashtableClass obj=new HashtableClass();
		obj.meth();
		
	}

}
